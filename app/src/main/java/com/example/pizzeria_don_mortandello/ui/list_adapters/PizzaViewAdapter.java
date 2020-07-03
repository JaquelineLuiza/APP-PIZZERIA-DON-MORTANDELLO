package com.example.pizzeria_don_mortandello.ui.list_adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.model.PizzaModel;

import java.util.ArrayList;

public class PizzaViewAdapter extends RecyclerView.Adapter<PizzasViewHolder> {

    private ArrayList<PizzaModel> pizzalist;
    private PizzaModel pizzaModel;

    public PizzaViewAdapter(ArrayList<PizzaModel> pizza) {
        this.pizzalist = pizza;
    }

    @NonNull
    @Override
    public PizzasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.pizza_view_holder, parent, false);
        PizzasViewHolder pizzasViewHolder = new PizzasViewHolder(view);
        final TextView txtNome = view.findViewById(R.id.txtNome);
        final TextView txtIngredientes = view.findViewById(R.id.txtIngredientes);

        txtNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int show = (txtIngredientes.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                txtIngredientes.setVisibility(show);
            }
        });
        return pizzasViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PizzasViewHolder holder, int position) {
        holder.bind(pizzalist.get(position));
    }

    @Override
    public int getItemCount() {
        return pizzalist.size();
    }
}
