package com.example.pizzeria_don_mortandello.ui.list_builders;

import android.app.Activity;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzeria_don_mortandello.model.PizzaModel;
import com.example.pizzeria_don_mortandello.model.PromocaoModel;
import com.example.pizzeria_don_mortandello.ui.list_adapters.PizzaViewAdapter;
import com.example.pizzeria_don_mortandello.ui.list_adapters.PromocaoViewAdapter;

import java.util.ArrayList;

public class DetailPromoListBuilder {
    private Activity activity;
    private RecyclerView rvPizza;
    private ArrayList<PizzaModel> pizzas;
    private PizzaViewAdapter pizzaViewAdapter;
    private LinearLayoutManager linearLayoutManager;

    public DetailPromoListBuilder(Activity activity, RecyclerView rvPizzaList, ArrayList<PizzaModel> pizza) {
        this.activity = activity;
        this.rvPizza = rvPizzaList;
        this.pizzas = pizza;
        this.pizzaViewAdapter = new PizzaViewAdapter(this.pizzas);
        this.linearLayoutManager = new LinearLayoutManager(activity);
    }
    public void load(){
        this.rvPizza.setLayoutManager(this.linearLayoutManager);
        this.rvPizza.setHasFixedSize(true);
        this.rvPizza.setAdapter(this.pizzaViewAdapter);
        rvPizza.addItemDecoration(new DividerItemDecoration(rvPizza.getContext(), DividerItemDecoration.VERTICAL));
    }
}
