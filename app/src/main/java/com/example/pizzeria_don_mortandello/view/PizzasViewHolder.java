package com.example.pizzeria_don_mortandello.view;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.model.PizzaModel;

public class PizzasViewHolder extends RecyclerView.ViewHolder{

    private TextView txtNome;
    private TextView txtPreco;
    private TextView txtIngredientes;
    private PizzaModel pizza;

    public PizzasViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNome = itemView.findViewById(R.id.txtNome);
        txtPreco = itemView.findViewById(R.id.txtPreco);
        txtIngredientes = itemView.findViewById(R.id.txtIngredientes);

    }

    public void bind(PizzaModel p){
        txtNome.setText(p.getNome());
        txtPreco.setText(p.getPreco());
        txtIngredientes.setText(p.getIngredientes());
        this.pizza = p;
    }

}
