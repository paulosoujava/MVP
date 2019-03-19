package br.com.mvp.ui.main

interface MainContract {
    interface View{

        fun showMessage(text: String)
        fun iniFruts()

    }

    interface Presenter {

        fun loginClick(name: String,pass: String)
    }
}