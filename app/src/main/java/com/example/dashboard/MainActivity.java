package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    FloatingActionButton fabPizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabPizza = findViewById(R.id.fab_pizza);
        fabPizza.setOnClickListener(this);
    }
    public void screenMenuPizza(){
        Intent menuPizza = new Intent(this,PizzaMenu.class);
        startActivity(menuPizza);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab_pizza:
                screenMenuPizza();
                break;

        }
    }
}