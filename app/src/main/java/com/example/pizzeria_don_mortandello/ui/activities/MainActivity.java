package com.example.pizzeria_don_mortandello.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzeria_don_mortandello.R;

public class MainActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onClickNew(View view){

            Intent intent = new Intent(this, InsertActivity.class);
            startActivity(intent);

        }

        public void onClickList(View view){
            Intent intent = new Intent(this, PizzaActivity.class);
            startActivity(intent);
        }

        public void onClickPromocao(View view){
            Intent intent = new Intent(this, PromocaoActivity.class);
            startActivity(intent);
        }
}
