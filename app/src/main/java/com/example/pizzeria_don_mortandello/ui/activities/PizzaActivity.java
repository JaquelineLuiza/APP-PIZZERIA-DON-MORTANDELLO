package com.example.pizzeria_don_mortandello.ui.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.data.DAOPizza;
import com.example.pizzeria_don_mortandello.ui.list_builders.PizzaListBuilder;
import com.example.pizzeria_don_mortandello.ui.list_builders.PromocaoListBuilder;

public class PizzaActivity extends AppCompatActivity{

    private RecyclerView rvPizzaList;
    private PizzaListBuilder pizzaListBuilder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        rvPizzaList = findViewById(R.id.rvPizzaList);
        this.pizzaListBuilder = new PizzaListBuilder(this,
                this.rvPizzaList, DAOPizza.getINSTANCE().getPizzas());
        this.pizzaListBuilder.load();
    }
}
