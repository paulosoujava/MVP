package br.com.mvp.model

class RepositorySession {
    val nName = "mvp"
    val mPass = "mvp"

    fun login( name: String,  pass: String ) = (name == nName && pass == mPass)
}
