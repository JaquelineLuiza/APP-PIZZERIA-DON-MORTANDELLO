package com.example.pizzeria_don_mortandello.ui.list_adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.model.PizzaModel;
import com.example.pizzeria_don_mortandello.model.PromocaoModel;
import com.example.pizzeria_don_mortandello.ui.activities.DetailPromoActivity;

import java.util.ArrayList;

public class PromocaoViewAdapter extends RecyclerView.Adapter<PromocaoViewHolder> {

    private ArrayList<PromocaoModel> promocoes;
    private ArrayList<PromocaoModel> pizzalist;
    Context mContext;

    public PromocaoViewAdapter(ArrayList<PromocaoModel> pro, Context context){
        this.promocoes = pro;
        this.mContext = context;
    }

    @NonNull
    @Override
    public PromocaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.promocao_view_holder, parent, false);
        final PromocaoViewHolder promocaoViewHolder = new PromocaoViewHolder(view);
        final TextView txtNome = view.findViewById(R.id.txtPromocao);
        final TextView txtInfo = view.findViewById(R.id.txtInfo);
        final ImageView imgEye = view.findViewById(R.id.imgEye);

        txtNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int show = (txtInfo.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                txtInfo.setVisibility(show);
            }
        });

        imgEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailActivity = new Intent(mContext, DetailPromoActivity.class);
                int position = promocaoViewHolder.getAdapterPosition();

                Bundle extra = new Bundle();
                extra.putSerializable("pizzas", promocoes.get(position).getPizzas());
                detailActivity.putExtra("pizzas", extra);

                detailActivity.putExtra("nome",promocoes.get(position).getNome());
                detailActivity.putExtra("desconto",promocoes.get(position).getPorcentagemDesconto());
                detailActivity.putExtra("precoFinal",promocoes.get(position).getPrecoTotal());

                detailActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(detailActivity);
            }
        });


        return promocaoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PromocaoViewHolder holder, int position) {
        holder.bind(this.promocoes.get(position));
    }

    @Override
    public int getItemCount() {
        return this.promocoes.size();
    }
}
