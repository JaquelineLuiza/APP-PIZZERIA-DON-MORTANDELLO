package com.example.pizzeria_don_mortandello.data;

import com.example.pizzeria_don_mortandello.model.PromocaoModel;

import java.util.ArrayList;
import java.util.Collections;

public class DAOPromocao {
    private ArrayList<PromocaoModel> promocoes;
    private static DAOPromocao INSTANCE;

    private DAOPromocao(){//Construtor
        this.promocoes = new ArrayList<>();
        DummyData.geradorPromocao(this.promocoes);
        Collections.sort(this.promocoes);
    }

    public static DAOPromocao getINSTANCE(){
        if (INSTANCE == null)
            INSTANCE = new DAOPromocao();

        return INSTANCE;
    }

    public ArrayList<PromocaoModel> getPromocoes(){
        return promocoes;
    }
}
