package com.example.samsung.p1101_dialogfragment;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private DialogFragment dialogFragment1, dialogFragment2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogFragment1 = new Dialog1();
        dialogFragment2 = new Dialog2();
    }

    public void onClickBtn(View view) {

        switch (view.getId()) {

            case R.id.btnDialog1 :
                dialogFragment1.show(getFragmentManager(), "dialogFragment1");
                break;
            case R.id.btnDialog2 :
                dialogFragment2.show(getFragmentManager(), "dialogFragment2");
                break;
            default:
                break;
        }
    }
}
