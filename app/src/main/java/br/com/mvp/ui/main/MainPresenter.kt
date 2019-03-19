package br.com.mvp.ui.main

import br.com.mvp.model.RepositorySession

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {

    private var repositorioSessao: RepositorySession = RepositorySession()


    override fun loginClick(nome: String, senha: String) {

        if(nome.isEmpty()){
            view.showMessage("Nome invalido!")
            return
        }

        if(senha.isEmpty()){
            view.showMessage("Digite uma senha")
            return
        }


        if(repositorioSessao.login(nome, senha)) {

            view.showMessage("Login efetuado!")

            view.iniFruts()

        }else{
            view.showMessage("Falha no login")
        }
    }
}