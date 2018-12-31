package br.com.ascenderideias.www.tupicionrio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Plantas extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);

        String[] plantasArray = getResources().getStringArray(R.array.plantas);
        String[] plantasDescArray = getResources().getStringArray(R.array.plantas_desc);

        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = plantasArray[i];
            String desc = plantasDescArray[i];
            Item item = new Item(titulo, desc, R.drawable.ic_plantas);
            list.add(item);


            ItemAdapter adapter = new ItemAdapter(this, list, R.color.plantas_categoria);
            ListView listView = findViewById(R.id.rootPlantas);
            listView.setAdapter(adapter);
        }
    }
}
