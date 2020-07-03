package com.example.pizzeria_don_mortandello.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class PizzaModel implements Comparable<PizzaModel>,Parcelable, Serializable {

    private String nome;
    private String preco;
    private String ingredientes;

    public PizzaModel(String nome, String preco, String ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    protected PizzaModel(Parcel in) {
        nome = in.readString();
        preco = in.readString();
        ingredientes = in.readString();
    }

    public static final Creator<PizzaModel> CREATOR = new Creator<PizzaModel>() {
        @Override
        public PizzaModel createFromParcel(Parcel in) {
            return new PizzaModel(in);
        }

        @Override
        public PizzaModel[] newArray(int size) {
            return new PizzaModel[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(preco);
        dest.writeString(ingredientes);
    }

    @Override
    public String toString() {
        return "PizzaModel{" +
                "nome='" + nome + '\'' +
                ", preco='" + preco + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                '}';
    }

    @Override
    public int compareTo(PizzaModel o) {
        return this.getNome().toUpperCase().compareTo(o.getNome().toUpperCase());
    }
}
