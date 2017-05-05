package com.example.samsung.p1101_dialogfragment;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by samsung on 05.05.2017.
 */

public class Dialog1 extends DialogFragment implements View.OnClickListener{

    private View view;
    private String message;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        getDialog().setTitle(R.string.title_dialog);

        view = inflater.inflate(R.layout.dialog1, null);
        view.findViewById(R.id.btnYes).setOnClickListener(this);
        view.findViewById(R.id.btnNo).setOnClickListener(this);
        view.findViewById(R.id.btnMaybe).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        message = getString(R.string.dialog_1_) + " onClick() " + ((Button) v).getText();
        Messager.sendToAllRecipients(getActivity(), message);
        dismiss();
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        message = getString(R.string.dialog_1_) + " onDismiss()";
        Messager.sendToAllRecipients(getActivity(), message);
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        message = getString(R.string.dialog_1_) + " onCancel()";
        Messager.sendToAllRecipients(getActivity(), message);
    }
}
