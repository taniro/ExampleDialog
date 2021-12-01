package br.ufrn.eaj.tads.exampledialog

import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class ListaDialogFragment :DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let{
            val builder = AlertDialog.Builder(it)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Escolha uma cor")
                .setItems(R.array.cores){dialogInterface, i ->
                    val mainlayout = it.findViewById<ConstraintLayout>(R.id.mainlayout)
                    when(i){
                        0->mainlayout.setBackgroundResource(android.R.color.holo_red_dark)
                        1->mainlayout.setBackgroundResource(android.R.color.holo_orange_dark)
                        2->mainlayout.setBackgroundResource(android.R.color.holo_blue_dark)
                        3 -> {
                            Toast.makeText(it, "Escolhei laranja", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            builder.create()
        }?: throw IllegalStateException("Activity not found")
    }
}