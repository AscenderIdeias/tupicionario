package br.com.ascenderideias.www.tupicionrio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Culinaria extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);
        String[] culinariaArray = getResources().getStringArray(R.array.culinaria);
        String[] culinariaDescArray = getResources().getStringArray(R.array.culinaria_desc);

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = culinariaArray[i];
            String desc = culinariaDescArray[i];
            Item item = new Item(titulo, desc, R.drawable.ic_culinaria);
            list.add(item);
        }
        ItemAdapter adapter = new ItemAdapter(this, list, R.color.culinaria_categoria);
        ListView listView = findViewById(R.id.rootCulinaria);
        listView.setAdapter(adapter);
    }

}