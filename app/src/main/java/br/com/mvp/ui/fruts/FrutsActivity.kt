package br.com.mvp.ui.fruts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import br.com.mvp.R
import br.com.mvp.model.RepositoryFruts

class FrutsActivity : AppCompatActivity(), FrutsContract.View {

    private lateinit var presenter: FrutsPresenter

    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruts)

        // iniciar presenter
        presenter = FrutsPresenter(
            this,
            RepositoryFruts()
        )


        lista = findViewById(R.id.lista_frtutas)
        //lista.adapter = adapter

        // carregar frutas
        presenter.getFruts()
    }

    override fun showData(fruts: Array<String>) {

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
            android.R.id.text1, fruts)

        lista.adapter = adapter
    }
}
