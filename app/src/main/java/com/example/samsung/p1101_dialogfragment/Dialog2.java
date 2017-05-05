package com.example.samsung.p1101_dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

/**
 * Created by samsung on 05.05.2017.
 */

public class Dialog2 extends DialogFragment implements DialogInterface.OnClickListener {

    private String message;
    private AlertDialog.Builder adb;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        adb = new AlertDialog.Builder(getActivity())
                .setTitle(getString(R.string.title_dialog))
                .setPositiveButton(R.string.yes, this)
                .setNegativeButton(R.string.no, this)
                .setNeutralButton(R.string.maybe, this)
                .setMessage(R.string.text_of_your_message);
        return adb.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        int i = 0;

        switch (which) {

            case Dialog.BUTTON_POSITIVE :
                i = R.string.yes;
                break;
            case DialogInterface.BUTTON_NEGATIVE :
                i = R.string.no;
                break;
            case DialogInterface.BUTTON_NEUTRAL :
                i = R.string.maybe;
                break;
            default:
                break;
        }
        if (i > 0) {
            message = getString(R.string.dialog_2_) + " onClick() " + getString(i);
            Messager.sendToAllRecipients(getActivity(), message);
        }
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        message = getString(R.string.dialog_2_) + " onDismiss()";
        Messager.sendToAllRecipients(getActivity(), message);
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        message = getString(R.string.dialog_2_) + " onCancel()";
        Messager.sendToAllRecipients(getActivity(), message);
    }
}
