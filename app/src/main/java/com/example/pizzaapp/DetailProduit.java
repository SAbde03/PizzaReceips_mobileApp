package com.example.pizzaapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzaapp.Classes.Produit;
import com.example.pizzaapp.services.ProduitService;

public class DetailProduit extends AppCompatActivity {

    public void dispose(View view) {
        finish();
    }
        private ProduitService ps;
        private ImageView image;
        private TextView desc;
        private TextView nom;
        private TextView ingredients;
        private TextView preparation;
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_detail_produit);
            Intent intent = getIntent();
            int id = Integer.parseInt(intent.getStringExtra("idf"));
            ps = ProduitService.getInstance();
            image = findViewById(R.id.photo);
            nom = findViewById(R.id.nompizza);
            ingredients=findViewById(R.id.Ingredient);
            preparation=findViewById(R.id.preparation);


            Produit p = ps.findById(id);
            image.setImageResource(p.getPhoto());
            desc = findViewById(R.id.desc);
            desc.setText(p.getDescription());
            nom.setText(p.getNom());
            ingredients.setText(p.getDtaisIngred());
            preparation.setText(p.getPreparation());



        }

    }
