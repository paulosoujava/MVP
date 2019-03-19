package br.com.mvp.model

class RepositoryFruts {

    private val frutas = arrayOf(
        "Banana",
        "Manga",
        "Pera",
        "Pecego"
    )

    fun getFruts(): Array<String>{
        return frutas
    }
}