package com.example.pizzaapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzaapp.Classes.Produit;
import com.example.pizzaapp.R;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {
        private List<Produit> produits;
        private LayoutInflater inflater;

        public ProduitAdapter(Activity activity, List<Produit> pr) {
            this.produits = pr;
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return produits.size();
        }

        @Override
        public Object getItem(int position) {
            return produits.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position + 1;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.pizza_item, null);

        TextView idf = convertView.findViewById(R.id.idf);
        TextView nom = convertView.findViewById(R.id.nompizza);
        TextView duree = convertView.findViewById(R.id.duree);
        TextView nbIngredients = convertView.findViewById(R.id.nbI);
        ImageView photo = convertView.findViewById(R.id.image);

        idf.setText(produits.get(position).getId()+"");
        nom.setText(produits.get(position).getNom());
        duree.setText(produits.get(position).getDuree()+"");
        nbIngredients.setText(produits.get(position).getNbrIngredients()+" Ingredients");
        photo.setImageResource(produits.get(position).getPhoto());
        return convertView;
    }

}
