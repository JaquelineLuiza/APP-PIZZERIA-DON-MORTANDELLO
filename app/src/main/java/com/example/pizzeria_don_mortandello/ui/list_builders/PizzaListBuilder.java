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

public class PizzaListBuilder {
    private Activity activity;
    private ArrayList<PizzaModel> pizzas;
    private RecyclerView rvPizzaList;
    private PizzaViewAdapter pizzaViewAdapter;
    private LinearLayoutManager linearLayoutManager;

    public PizzaListBuilder(Activity activity, RecyclerView rvPromo, ArrayList<PizzaModel> pizza) {
        this.activity = activity;
        this.rvPizzaList = rvPromo;
        this.pizzas = pizza;
        this.pizzaViewAdapter = new PizzaViewAdapter(this.pizzas);
        this.linearLayoutManager = new LinearLayoutManager(activity);
    }

    public void load(){
        this.rvPizzaList.setLayoutManager(this.linearLayoutManager);
        this.rvPizzaList.setHasFixedSize(true);
        this.rvPizzaList.setAdapter(this.pizzaViewAdapter);
        rvPizzaList.addItemDecoration(new DividerItemDecoration(rvPizzaList.getContext(), DividerItemDecoration.VERTICAL));
    }
}
