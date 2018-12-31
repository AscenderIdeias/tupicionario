package br.com.ascenderideias.www.tupicionrio;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    private int background;

    public ItemAdapter(Context context, ArrayList<Item> list, int backgroundColor) {
        super(context, 0, list);
        this.background = backgroundColor;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Item item = getItem(position);

        TextView titulo = itemView.findViewById(R.id.item_titulo);
        titulo.setText(item.getTitulo());

        TextView descricao = itemView.findViewById(R.id.item_desc);
        descricao.setText(item.getDescricao());

        ImageView icone = itemView.findViewById(R.id.item_icone);
        icone.setImageResource(item.getImage());

        LinearLayout layoutTextos = itemView.findViewById(R.id.item_layout_textos);
        int cor = ContextCompat.getColor(getContext(), background);
        layoutTextos.setBackgroundColor(cor);


        return itemView;

    }

}



