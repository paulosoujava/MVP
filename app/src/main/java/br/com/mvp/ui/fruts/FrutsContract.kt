package br.com.mvp.ui.fruts

interface FrutsContract {

    interface View{
        fun showData(fruts: Array<String>)
    }

    interface Presenter{

        fun getFruts()
    }
}