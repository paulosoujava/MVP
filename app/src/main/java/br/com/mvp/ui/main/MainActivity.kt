package br.com.mvp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.mvp.R
import br.com.mvp.ui.fruts.FrutsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , MainContract.View{

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)
        presenter = MainPresenter( this)

        btn_login.setOnClickListener {
        presenter.loginClick(  edt_username.text.toString(),  edt_password.text.toString())
        }
    }

    override fun showMessage(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

    override fun iniFruts() {
        startActivity( Intent(this, FrutsActivity::class.java))
    }
}
