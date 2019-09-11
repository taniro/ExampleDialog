package br.ufrn.eaj.tads.exampledialog

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class SabeAndroidDialogFragment :DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return activity?.let {
            var builder = AlertDialog.Builder(it)

            //var builder  = AlertDialog.Builder(it, android.R.style.Theme_Material_Light_Dialog_Presentation)
            //var builder  = AlertDialog.Builder(it, android.R.style.Theme_Material_Dialog_Presentation)
            //var builder  = AlertDialog.Builder(it,  android.R.style.Theme_Material)
            //var builder  = AlertDialog.Builder(it,  android.R.style.ThemeOverlay_Material_Dialog)
            //var builder  = AlertDialog.Builder(it,  android.R.style.Theme_Material_Dialog_MinWidth)


            .setIcon(R.mipmap.ic_launcher)
            .setTitle("Título")
            .setMessage("Você sabe programar para Android?")
            //Opção com o lambda fora é mais legível
            .setPositiveButton("Sim") {dialog, i ->
                Toast.makeText(it.baseContext, "Parabéns!", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Não") {dialog, i ->
                Toast.makeText(it.baseContext, "Estude mais!", Toast.LENGTH_SHORT).show()
            }
            builder.create()
        }?: throw IllegalStateException ("Activity not found")
    }
}