package com.example.mauricio.tc2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pro1, pro2, pro3, pro4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pro1 = (TextView) findViewById(R.id.proyecto1);
        pro2 = (TextView) findViewById(R.id.proyecto2);
        pro3 = (TextView) findViewById(R.id.proyecto3);
        pro4 = (TextView) findViewById(R.id.proyecto4);
    }

    public void onClicknota(View view) {
        Intent i = new Intent(this,calificar.class);
        switch(view.getId()){
            case R.id.proyecto1:
                startActivityForResult(i, 1);
                break;
            case R.id.proyecto2:
                startActivityForResult(i, 2);
                break;
            case R.id.proyecto3:
                startActivityForResult(i, 3);
                break;
            case R.id.proyecto4:
                startActivityForResult(i, 4);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK){
                Proyecto p1 = (Proyecto) data.getSerializableExtra("calificado");
                pro1.setText(String.valueOf(p1.getTotal()));
            }
        }
        if(requestCode == 2){
            if(resultCode == Activity.RESULT_OK){
                Proyecto p2 = (Proyecto) data.getSerializableExtra("calificado");
                pro2.setText(String.valueOf(p2.getTotal()));
            }
        }
        if(requestCode == 3){
            if(resultCode == Activity.RESULT_OK){
                Proyecto p3 = (Proyecto) data.getSerializableExtra("calificado");
                pro3.setText(String.valueOf(p3.getTotal()));
            }
        }
        if(requestCode == 4){
            if(resultCode == Activity.RESULT_OK){
                Proyecto p4 = (Proyecto) data.getSerializableExtra("calificado");
                pro4.setText(String.valueOf(p4.getTotal()));
            }
        }
    }
}