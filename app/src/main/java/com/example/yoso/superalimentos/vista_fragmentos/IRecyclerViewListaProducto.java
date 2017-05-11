package com.example.yoso.superalimentos.vista_fragmentos;

import com.example.yoso.superalimentos.adaptadores.ProductoAdaptador;
import com.example.yoso.superalimentos.pojo.Producto;

import java.util.ArrayList;

/**
 * Created by yoso on 11/05/17.
 */

public interface IRecyclerViewListaProducto {

    public void generarLinearLayoutVertical();

    public ProductoAdaptador crearAdaptador(ArrayList<Producto> productos);

    public void inicializadorAdaptadorRV(ProductoAdaptador adaptador);
}
