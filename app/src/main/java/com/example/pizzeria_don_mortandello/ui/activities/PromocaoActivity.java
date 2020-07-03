package com.example.pizzeria_don_mortandello.ui.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.data.DAOPromocao;
import com.example.pizzeria_don_mortandello.ui.list_adapters.PizzaViewAdapter;
import com.example.pizzeria_don_mortandello.ui.list_adapters.PromocaoViewAdapter;
import com.example.pizzeria_don_mortandello.ui.list_builders.PromocaoListBuilder;


public class PromocaoActivity extends AppCompatActivity{

    private RecyclerView rvPromocao;
    private PromocaoListBuilder promocaoListBuilder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promocao);
        rvPromocao = findViewById(R.id.rvPromocao);
        this.promocaoListBuilder = new PromocaoListBuilder(this,
                this.rvPromocao, DAOPromocao.getINSTANCE().getPromocoes());
        this.promocaoListBuilder.load();
    }
}
