package com.daftmobile.a4bhomework2

import android.content.Context
import android.content.DialogInterface
import android.support.v7.app.AlertDialog

fun showMsgDialog(context: Context,  msg: CharSequence) {
    val builder = AlertDialog.Builder(context)
    builder.setMessage(msg)
    builder.setPositiveButton("OK") { _: DialogInterface, _: Int -> }
    builder.show()
}
