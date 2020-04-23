package com.example.pizzeria_don_mortandello.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.data.DAOPizza;
import com.example.pizzeria_don_mortandello.model.PizzaModel;

import java.util.ArrayList;

public class PizzaViewAdapter extends RecyclerView.Adapter<PizzasViewHolder> {

    private ArrayList<PizzaModel> pizzalist;

    public PizzaViewAdapter() {
        pizzalist = DAOPizza.getINSTANCE().getPizzas();
    }

    @NonNull
    @Override
    public PizzasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.pizza_view_holder, parent, false);
        PizzasViewHolder pizzasViewHolder = new PizzasViewHolder(view);
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
