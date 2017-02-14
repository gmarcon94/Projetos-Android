package com.example.novo.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtN1 = null;
    private TextView txtN2 = null;
    private EditText editText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtN1 = (TextView) findViewById(R.id.txtN1);
        txtN2 = (TextView) findViewById(R.id.txtN2);
        editText = (EditText) findViewById(R.id.editText);
        sorteio();

    }

    public void verificar(View v){

        int n1 = Integer.parseInt(txtN1.getText().toString());
        int n2 = Integer.parseInt(txtN2.getText().toString());
        int r = Integer.parseInt(editText.getText().toString());

        String resp = "";

        if (r == (n1*n2))
            resp = "Correto";
        else resp = "Errado";

        Toast.makeText(this, resp, Toast.LENGTH_SHORT).show();
        sorteio();
    }

    private void sorteio(){

        Random n1 = new Random();
        Random n2 = new Random();

        int v1 = n1.nextInt(10);
        int v2 = n2.nextInt(10);


        txtN1.setText(String.valueOf(v1));
        txtN2.setText(String.valueOf(v2));
    }
}
