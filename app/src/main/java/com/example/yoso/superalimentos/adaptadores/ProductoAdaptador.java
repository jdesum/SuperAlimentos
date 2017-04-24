package com.example.yoso.superalimentos.adaptadores;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yoso.superalimentos.R;
import com.example.yoso.superalimentos.pojo.Producto;

import java.util.ArrayList;

/**
 * Lista Adaptador
 * Created by yoso on 24/04/17.
 */

public class ProductoAdaptador extends RecyclerView.Adapter<ProductoAdaptador.ProductoViewHolder> {

    Activity activity;
    ArrayList<Producto> productos;

    // Constructor
    public ProductoAdaptador(Activity activity, ArrayList<Producto> productos) {
        this.activity = activity;
        this.productos = productos;
    }

    @Override
    public ProductoViewHolder onCreateViewHolder(ViewGroup parent, int position) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_producto, parent, false);

        return new ProductoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ProductoViewHolder productoViewHolder, int position) {
        Producto producto = productos.get(position);
        productoViewHolder.nombre.setText(producto.getNombre());
        productoViewHolder.unidades.setText(producto.getUnidades());
        productoViewHolder.precio.setText(producto.getPrecio());
        productoViewHolder.idDrawable.setImageResource(producto.getIdDrawable());



    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    // Clase ViewHolder
    public static class ProductoViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre;
        private TextView unidades;
        private TextView precio;
        private ImageView idDrawable;

        public ProductoViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.tvNombre);
            unidades = (TextView) itemView.findViewById(R.id.tvUnidadesInventario);
            precio = (TextView) itemView.findViewById(R.id.tvPrecio);
            idDrawable = (ImageView) itemView.findViewById(R.id.imgProducto);
        }
    }

}
