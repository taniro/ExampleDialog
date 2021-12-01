package br.ufrn.eaj.tads.exampledialog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import br.ufrn.eaj.tads.exampledialog.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dialogmulti = MultiListDialogFragment()

        binding.button1.setOnClickListener {
            val dialog = SendMessageDialogFragment()
            dialog.isCancelable = false
            dialog.show(supportFragmentManager,"Dialog")
        }

        binding.button2.setOnClickListener {
            val dialog = SabeAndroidDialogFragment()
            dialog.show(supportFragmentManager,"Dialog2")
        }

        binding.button3.setOnClickListener {
            val dialog = ListaDialogFragment()
            dialog.show(supportFragmentManager, "Dialog3")
        }

        binding.button4.setOnClickListener {
            dialogmulti.show(supportFragmentManager, "Dialog4")
            Toast.makeText(this, "${dialogmulti.frutas[0]} ${dialogmulti.frutas[1]} ${dialogmulti.frutas[2]}", Toast.LENGTH_SHORT).show()
        }

        binding.button5.setOnClickListener {
            val dialog = LoginDialogFragment()
            dialog.show(supportFragmentManager, "Dialog5")
        }

        binding.button6.setOnClickListener {
            Snackbar.make(binding.mainlayout, "Atualização realizada", Snackbar.LENGTH_LONG)
                .setAction("Cancelar"){
                    Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}
