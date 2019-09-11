package br.ufrn.eaj.tads.exampledialog

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class MultiListDialogFragment:DialogFragment() {

    var frutas = booleanArrayOf(false, false, false)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Escolha suas frutas prediletas")
                .setMultiChoiceItems(R.array.frutas, frutas) {dialogInterface:DialogInterface, item:Int, isChecked:Boolean ->
                    if(isChecked){
                        frutas[item] = true
                    }else if (frutas[item]){
                        frutas[item]=false
                    }
                }
                .setPositiveButton("Ok"){dialogInterface, i ->
                }
            builder.create()
        }?: throw IllegalStateException("Activity not found")
    }
}