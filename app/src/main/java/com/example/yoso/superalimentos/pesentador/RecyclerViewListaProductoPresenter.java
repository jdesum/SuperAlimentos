package com.example.yoso.superalimentos.pesentador;

import android.content.Context;

import com.example.yoso.superalimentos.db.ConstructorProductos;
import com.example.yoso.superalimentos.pojo.Producto;
import com.example.yoso.superalimentos.vista_fragmentos.IRecyclerViewListaProducto;
import com.example.yoso.superalimentos.vista_fragmentos.ListaProductos;

import java.util.ArrayList;

/**
 * Created by yoso on 11/05/17.
 */

public class RecyclerViewListaProductoPresenter implements IRecyclerViewListaProductosPresenter {

    private IRecyclerViewListaProducto iRecyclerViewListaProducto;
    private Context context;
    private ConstructorProductos constructorProductos;
    private ArrayList<Producto> productos;


    // Constructor
    public RecyclerViewListaProductoPresenter(IRecyclerViewListaProducto iRecyclerViewListaProducto, Context context) {
        this.iRecyclerViewListaProducto = iRecyclerViewListaProducto;
        this.context = context;
        obtenerProductoBaseDatos();
    }



    @Override
    public void obtenerProductoBaseDatos() {
        constructorProductos = new ConstructorProductos(context);
        productos = constructorProductos.obtenerDatos();
        mostrarProductoRV();

    }

    @Override
    public void mostrarProductoRV() {
        iRecyclerViewListaProducto.inicializadorAdaptadorRV(iRecyclerViewListaProducto.crearAdaptador(productos));
        iRecyclerViewListaProducto.generarLinearLayoutVertical();
    }
}
