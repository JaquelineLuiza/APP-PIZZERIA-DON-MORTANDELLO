package com.example.pizzeria_don_mortandello.data;

import com.example.pizzeria_don_mortandello.model.PizzaModel;

import java.util.ArrayList;
import java.util.Collections;

public class DAOPizza {//Singleton
    private ArrayList<PizzaModel> pizzas;
    private static DAOPizza INSTANCE;

    private DAOPizza(){//Construtor
        this.pizzas = new ArrayList<>();
        DummyData.generatePizzas(this.pizzas);
        Collections.sort(this.pizzas);
    }

    public static DAOPizza getINSTANCE(){
        if (INSTANCE == null)
            INSTANCE = new DAOPizza();

        return INSTANCE;
    }

    public void addPizza(PizzaModel p) {
        pizzas.add(p);
        Collections.sort(this.pizzas);
    }

    public ArrayList<PizzaModel> getPizzas(){
        return pizzas;
    }

}

