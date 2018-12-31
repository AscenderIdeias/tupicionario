package br.com.ascenderideias.www.tupicionrio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TextView tvBichos = findViewById(R.id.tvBichos);
        tvBichos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Bichos.class);
                startActivity(i);
            }
        });
        TextView tvCulinaria = findViewById(R.id.tvCulinaria);
        tvCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Culinaria.class);
                startActivity(i);
            }
        });
        TextView tvPlantas = findViewById(R.id.tvPlantas);
        tvPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Plantas.class);
                startActivity(i);
            }
        });
        TextView tvPovosNativos = findViewById(R.id.tvPovosNativos);
        tvPovosNativos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, PovosNativos.class);
                startActivity(i);
            }
        });

    }
}
