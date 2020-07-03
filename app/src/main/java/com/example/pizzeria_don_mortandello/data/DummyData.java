package com.example.pizzeria_don_mortandello.data;

import com.example.pizzeria_don_mortandello.model.PizzaModel;
import com.example.pizzeria_don_mortandello.model.PromocaoModel;

import java.util.ArrayList;
import java.util.Random;

public class DummyData {
    public static final void generatePizzas(ArrayList<PizzaModel> pizzaModels){
        PizzaModel pizzaModel;
        pizzaModel = new PizzaModel("Camarão", "12.90", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Mortadela", "22.50", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Cachorro-quente", "32.25", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Sardinha", "42.00", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Muçarela", "52.00", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Ovo", "62.10", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Baiana", "72.45", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Mineira", "82.32", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Portuguesa", "92.78", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Goiana", "13.99", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Fumaça", "23.98", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Infarto", "43.75", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Infarto duplo", "53.30", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("A moda", "63.20", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("A moda da casa", "73.00", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Pensão da titia", "83.90", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Hambuguer", "93.99", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Brigadeiro", "14.89", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Paçoca", "24.62", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Irlandesa", "34.35", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Mandioquinha", "44.21", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("Romeu e Julieta", "54.00", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
        pizzaModel = new PizzaModel("4 queijos", "64.78", "Camarão, tomate, presunto, queijo");
        pizzaModels.add(pizzaModel);
    }

    public static final void  geradorPromocao(ArrayList<PromocaoModel> promocoes) {
        int NUMPROMOS = 5; // numero de promocoes a serem geradas
        int NUMAXPIZZAS = 3; // numero maximo de pizzas por promocao
        int NUMIMPORC = 5; // numero maximo de pizzas por promocao
        int NUMAXPORC = 20; // numero maximo de pizzas por promocao
        Random aleatorio = new Random();
        if(!DAOPizza.getINSTANCE().getPizzas().isEmpty()){
            for (int i = 0; i<NUMPROMOS; i++){
                int numPizzas = aleatorio.nextInt(NUMAXPIZZAS) + 1;
                int pctDesc = aleatorio.nextInt((NUMAXPORC - NUMIMPORC  + 1) + NUMIMPORC);
                PromocaoModel promo = new PromocaoModel("PROMO "+ (i + 1), pctDesc);
                for (int j = 0; j<numPizzas; j++){
                    int indice = aleatorio.nextInt(DAOPizza.getINSTANCE().getPizzas().size());
                    promo.addPizzaToPizzas(DAOPizza.getINSTANCE().getPizzas().get(indice));
                }
                promocoes.add(promo);
            }
        }
    }
}
