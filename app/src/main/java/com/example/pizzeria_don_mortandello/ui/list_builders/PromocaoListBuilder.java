package com.example.pizzeria_don_mortandello.ui.list_builders;

import android.app.Activity;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzeria_don_mortandello.model.PizzaModel;
import com.example.pizzeria_don_mortandello.model.PromocaoModel;
import com.example.pizzeria_don_mortandello.ui.activities.DetailPromoActivity;
import com.example.pizzeria_don_mortandello.ui.list_adapters.PromocaoViewAdapter;

import java.util.ArrayList;

public class PromocaoListBuilder {
    private Activity activity;
    private RecyclerView rvPromocao;
    private ArrayList<PromocaoModel> promocoes;
    private PromocaoViewAdapter promocaoViewAdapter;
    private LinearLayoutManager linearLayoutManager;

    public PromocaoListBuilder(Activity activity, RecyclerView rvPromo, ArrayList<PromocaoModel> promocoes) {
        this.activity = activity;
        this.rvPromocao = rvPromo;
        this.promocoes = promocoes;
        this.promocaoViewAdapter = new PromocaoViewAdapter(this.promocoes, activity.getApplicationContext());
        this.linearLayoutManager = new LinearLayoutManager(activity);
    }

    public void load(){
        this.rvPromocao.setLayoutManager(this.linearLayoutManager);
        this.rvPromocao.setHasFixedSize(true);
        this.rvPromocao.setAdapter(this.promocaoViewAdapter);
        rvPromocao.addItemDecoration(new DividerItemDecoration(rvPromocao.getContext(), DividerItemDecoration.VERTICAL));
    }
}
