package com.example.projetofinaldispositivosmoveis;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterGuia extends ArrayAdapter<Guia> {

    private Activity context;
    List<Guia> guiasAnimais;
    TextView tvNome, tvTipo;
    public AdapterGuia (Activity context, List<Guia> guiasAnimais){
        super(context,R.layout.layout_item_guia, guiasAnimais);
        this.context = context;
        this.guiasAnimais = guiasAnimais;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_item_guia, null, true);

        tvNome = (TextView) listViewItem.findViewById(R.id.tvNomeAnimalMostrar);
        tvTipo = (TextView) listViewItem.findViewById(R.id.tvTipoAnimalMostrar);

        Guia guias = guiasAnimais.get(position);
        tvNome.setText(guias.getNomeAnimal());
        tvTipo.setText(guias.getTipoAnimal());

        return listViewItem;
    }
}
