package br.ufrn.eaj.tads.exampledialog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialogmulti = MultiListDialogFragment()

        button1.setOnClickListener {
            val dialog = SendMessageDialogFragment()
            dialog.isCancelable = false
            dialog.show(supportFragmentManager,"Dialog")
        }

        button2.setOnClickListener {
            val dialog = SabeAndroidDialogFragment()
            dialog.show(supportFragmentManager,"Dialog2")
        }

        button3.setOnClickListener {
            val dialog = ListaDialogFragment()
            dialog.show(supportFragmentManager, "Dialog3")
        }

        button4.setOnClickListener {
            dialogmulti.show(supportFragmentManager, "Dialog4")
            Toast.makeText(this, "${dialogmulti.frutas[0]} ${dialogmulti.frutas[1]} ${dialogmulti.frutas[2]}", Toast.LENGTH_SHORT).show()
        }

        button5.setOnClickListener {
            val dialog = LoginDialogFragment()
            dialog.show(supportFragmentManager, "Dialog5")
        }

        button6.setOnClickListener {
            Snackbar.make(mainlayout, "Atualização realizada", Snackbar.LENGTH_LONG)
                .setAction("Cancelar"){
                    Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}
