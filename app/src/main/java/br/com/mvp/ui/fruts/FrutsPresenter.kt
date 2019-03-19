package br.com.mvp.ui.fruts

import br.com.mvp.model.RepositoryFruts

class FrutsPresenter( private val view: FrutsContract.View,
                      private val repositoryFruts: RepositoryFruts) : FrutsContract.Presenter {

    override fun getFruts() {
        val fruts = repositoryFruts.getFruts()

        fruts.sortBy { it.length }

        view.showData( fruts)

    }
}