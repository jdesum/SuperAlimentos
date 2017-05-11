package com.example.yoso.superalimentos.vista_fragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yoso.superalimentos.R;
import com.example.yoso.superalimentos.adaptadores.ProductoAdaptador;
import com.example.yoso.superalimentos.pesentador.IRecyclerViewListaProductosPresenter;
import com.example.yoso.superalimentos.pesentador.RecyclerViewListaProductoPresenter;
import com.example.yoso.superalimentos.pojo.Producto;

import java.util.ArrayList;

/**
 * Fragmento Lista
 * Created by yoso on 11/05/17.
 */

public class ListaProductos extends Fragment implements IRecyclerViewListaProducto {

    // Atributos
    private ArrayList<Producto> productos;
    private RecyclerView listaProductos;
    private IRecyclerViewListaProductosPresenter presenter;

    // constructor vacio
    public ListaProductos() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v  = inflater.inflate(R.layout.lista_mascotas, container, false);

        listaProductos = (RecyclerView) v.findViewById(R.id.rvProductos);

        // Llamar el presentador
        presenter = new RecyclerViewListaProductoPresenter(this, getContext());



        return v;
    }

    @Override
    public void generarLinearLayoutVertical() {

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaProductos.setLayoutManager(llm);

    }

    @Override
    public ProductoAdaptador crearAdaptador(ArrayList<Producto> productos) {

        ProductoAdaptador adaptador = new ProductoAdaptador(getActivity(), productos);

        return adaptador;
    }

    @Override
    public void inicializadorAdaptadorRV(ProductoAdaptador adaptador) {

        listaProductos.setAdapter(adaptador);
    }
}
