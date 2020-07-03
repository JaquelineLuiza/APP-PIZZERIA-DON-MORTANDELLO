package com.example.pizzeria_don_mortandello.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class PromocaoModel implements Comparable<PromocaoModel>, Parcelable {

    private String nome;
    private ArrayList<PizzaModel> pizzas;
    private float porcentagemDesconto;
    private float precoFinal;

    public PromocaoModel(String s, float pctDesc) {
        this.nome = s;
        this.porcentagemDesconto = pctDesc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<PizzaModel> getPizzas() {
        return pizzas;
    }

    public void addPizzaToPizzas(PizzaModel p){
        if (pizzas == null){
            pizzas = new ArrayList<>();
        }
        pizzas.add(p);
    }

    public void setPizzas(ArrayList<PizzaModel> pizzas) {
        this.pizzas = pizzas;
    }

    public float getPorcentagemDesconto() {
        return porcentagemDesconto;
    }
    public float getPrecoTotal() {
        precoFinal = 0;
        for (PizzaModel pizza : pizzas) {
            precoFinal = precoFinal + Float.parseFloat(pizza.getPreco());
        }

        precoFinal = precoFinal - ((porcentagemDesconto / 100) * precoFinal);

        return precoFinal;
    }

    public void setPorcentagemDesconto(float porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public static Creator<PromocaoModel> getCREATOR() {
        return CREATOR;
    }

    public PromocaoModel(Parcel in) {
    }

    public static final Creator<PromocaoModel> CREATOR = new Creator<PromocaoModel>() {
        @Override
        public PromocaoModel createFromParcel(Parcel in) {
            return new PromocaoModel(in);
        }

        @Override
        public PromocaoModel[] newArray(int size) {
            return new PromocaoModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int compareTo(PromocaoModel o) {
        return this.getNome().toUpperCase().compareTo(o.getNome().toUpperCase());
    }

    @Override
    public String toString() {
        String texto = "Pizza ("+porcentagemDesconto+"%)"+"\n";
        for (PizzaModel p: pizzas) {
            texto = texto + p.getNome() + "\n";
        }

        return texto;
    }
}
