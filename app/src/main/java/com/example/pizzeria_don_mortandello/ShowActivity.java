package com.example.pizzeria_don_mortandello;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pizzeria_don_mortandello.model.PizzaModel;
import com.example.pizzeria_don_mortandello.view.PizzaViewAdapter;

public class ShowActivity extends AppCompatActivity{

    private RecyclerView rvPizzaList;
    private PizzaViewAdapter pizzaViewAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        rvPizzaList = findViewById(R.id.rvPizzaList);
        pizzaViewAdapter = new PizzaViewAdapter();
        rvPizzaList.setLayoutManager(new LinearLayoutManager(this));
        rvPizzaList.setHasFixedSize(true);
        rvPizzaList.setAdapter(pizzaViewAdapter);
        rvPizzaList.addItemDecoration(new DividerItemDecoration(rvPizzaList.getContext(), DividerItemDecoration.VERTICAL));
    }
}
