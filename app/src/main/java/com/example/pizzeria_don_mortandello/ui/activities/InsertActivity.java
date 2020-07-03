package com.example.pizzeria_don_mortandello.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzeria_don_mortandello.R;
import com.example.pizzeria_don_mortandello.data.DAOPizza;
import com.example.pizzeria_don_mortandello.model.PizzaModel;


public class InsertActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextPreco;
    private EditText editTextIngredientes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        editTextNome = findViewById(R.id.editTextNome);
        editTextPreco = findViewById(R.id.editTextPreco);
        editTextIngredientes = findViewById(R.id.editTextIngredientes);
    }

    public void onClickSave(View view){
        PizzaModel p = new PizzaModel(
            editTextNome.getText().toString(),
            editTextPreco.getText().toString().contains(".")? editTextPreco.getText().toString() :editTextPreco.getText().toString() + ".00" ,
            editTextIngredientes.getText().toString()
        );
        DAOPizza.getINSTANCE().addPizza(p);
        finish();
    }


}