package br.ufrn.eaj.tads.exampledialog

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import android.content.DialogInterface
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import android.R




class SendMessageDialogFragment : DialogFragment() {

    /*
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        //uso de uma classe com padrão builder para construção da caixa de diálogo
        val builder = AlertDialog.Builder(activity!!)
        //adição da mensagem da caixa
        builder.setMessage("Deseja enviar a mensagem?")
            //Botão de 'Sim"
            .setPositiveButton("Sim", DialogInterface.OnClickListener { dialog, id ->
                //TODO
            })
            //Botão de 'Não'
            .setNegativeButton("Não", DialogInterface.OnClickListener { dialog, id ->
                //TODO
            })
        //Cria a instrância do AlertDialog e o retorna
        return builder.create()
    }

     */


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setMessage("Deseja enviar a mensagem?")
                .setPositiveButton("Sim",
                    DialogInterface.OnClickListener { dialog, id ->
                        Toast.makeText(it.baseContext, "Mensagem enviada!", Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("Não",
                    DialogInterface.OnClickListener { dialog, id ->
                        Toast.makeText(it.baseContext, "Cancelado", Toast.LENGTH_SHORT).show()
                    })
            // Create the AlertDialog object and return it
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

}