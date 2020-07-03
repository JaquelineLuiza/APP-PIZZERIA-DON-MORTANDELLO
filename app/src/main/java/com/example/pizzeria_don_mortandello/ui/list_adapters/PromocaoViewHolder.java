package com.example.pizzeria_don_mortandello.ui.list_adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.model.PizzaModel;
import com.example.pizzeria_don_mortandello.model.PromocaoModel;

public class PromocaoViewHolder extends RecyclerView.ViewHolder {

    private TextView txtPromocao;
    private TextView txtInfo;
    private ImageView imgEye;
    private PromocaoModel promocaoModel;

    public PromocaoViewHolder(@NonNull View itemView) {
        super(itemView);
        this.txtPromocao = this.itemView.findViewById(R.id.txtPromocao);
        this.txtInfo = this.itemView.findViewById(R.id.txtInfo);
        this.imgEye = this.itemView.findViewById(R.id.imgEye);
    }
    public void bind(PromocaoModel promocaoModel){
        this.txtPromocao.setText(promocaoModel.getNome());
        this.txtInfo.setText(promocaoModel.toString());
        this.promocaoModel = promocaoModel;
    }

}
