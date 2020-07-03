package com.example.pizzeria_don_mortandello.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.data.DAOPizza;
import com.example.pizzeria_don_mortandello.data.DAOPromocao;
import com.example.pizzeria_don_mortandello.model.PizzaModel;
import com.example.pizzeria_don_mortandello.model.PromocaoModel;
import com.example.pizzeria_don_mortandello.ui.list_adapters.PizzaViewAdapter;
import com.example.pizzeria_don_mortandello.ui.list_adapters.PromocaoViewAdapter;
import com.example.pizzeria_don_mortandello.ui.list_builders.DetailPromoListBuilder;
import com.example.pizzeria_don_mortandello.ui.list_builders.PizzaListBuilder;
import com.example.pizzeria_don_mortandello.ui.list_builders.PromocaoListBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class DetailPromoActivity extends AppCompatActivity {

    private RecyclerView rvDetail;
    private TextView txtPromo, txtDesconto, textView7;
    private DetailPromoListBuilder promoListBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_promo);
        rvDetail = findViewById(R.id.pizzasComDesconto);
        String nomePromo = getIntent().getExtras().getString("nome");
        float descontoPorcentagem = getIntent().getExtras().getFloat("desconto");
        float precoFinal = getIntent().getExtras().getFloat("precoFinal");
        BigDecimal Output= new BigDecimal(precoFinal).setScale(2, RoundingMode.UP);
        Bundle extra = getIntent().getBundleExtra("pizzas");
        ArrayList<PizzaModel> pizzas = (ArrayList<PizzaModel>) extra.getSerializable("pizzas");

        txtPromo = findViewById(R.id.txtPromo);
        txtDesconto = findViewById(R.id.txtDesconto);
        textView7 = findViewById(R.id.textView7);

        txtPromo.setText(nomePromo);
        txtDesconto.setText("" + descontoPorcentagem+"%");
        textView7.setText("R$" + Output);

        this.promoListBuilder = new DetailPromoListBuilder(this,
                this.rvDetail, pizzas);
        this.promoListBuilder.load();

    }
}