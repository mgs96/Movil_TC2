package com.example.mauricio.tc2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class calificar extends AppCompatActivity {

    EditText funcionalidad;
    EditText presentacion;
    EditText usabilidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar);

        funcionalidad = (EditText) findViewById(R.id.EDTfuncionalidad);
        presentacion = (EditText) findViewById(R.id.EDTpresentacion);
        usabilidad = (EditText) findViewById(R.id.EDTusabilidad);
    }


    public void onClickcalificar(View view) {
        double fun = 0, pre = 0, us = 0, tot = 0;

        if(TextUtils.isEmpty(funcionalidad.getText().toString())){
            funcionalidad.setError("Digita un valor");
        }
        else{
            fun = Double.parseDouble(funcionalidad.getText().toString());
        }

        if(TextUtils.isEmpty(presentacion.getText().toString())){
            presentacion.setError("Digita un valor");
        }
        else{
            pre = Double.parseDouble(presentacion.getText().toString());
        }

        if(TextUtils.isEmpty(usabilidad.getText().toString())){
            usabilidad.setError("Digita un valor");
        }
        else {
            us = Double.parseDouble(usabilidad.getText().toString());
        }

        tot = fun * 0.5 + pre * 0.25 + us * 0.25;

        Intent returnIntent = new Intent();
        returnIntent.putExtra("calificado", new Proyecto(fun,pre,us,tot));
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}
