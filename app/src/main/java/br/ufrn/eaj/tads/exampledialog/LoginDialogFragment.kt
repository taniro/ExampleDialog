package br.ufrn.eaj.tads.exampledialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class LoginDialogFragment:DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let{

            var builder = AlertDialog.Builder(it)
                .setView(it.layoutInflater.inflate(R.layout.loginlayout, null))
                .setPositiveButton("Ok"){dialogInterface, i ->

                }
            builder.create()
        }?: throw IllegalStateException("Activity not found")
    }
}