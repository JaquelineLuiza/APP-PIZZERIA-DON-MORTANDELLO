package com.example.pizzeria_don_mortandello.data;

import com.example.pizzeria_don_mortandello.model.PizzaModel;

import java.util.ArrayList;

public class DAOPizza {//Singleton
    private ArrayList<PizzaModel> pizzas;
    private static DAOPizza INSTANCE;

    private DAOPizza(){//Construtor
        pizzas = new ArrayList<>();
    }

    public static DAOPizza getINSTANCE(){
        if (INSTANCE == null)
            INSTANCE = new DAOPizza();

        return INSTANCE;
    }

    public void addPizza(PizzaModel p) {
        pizzas.add(p);
    }

    public ArrayList<PizzaModel> getPizzas(){
        return pizzas;
    }

}

