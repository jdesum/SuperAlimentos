package com.example.yoso.superalimentos.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.yoso.superalimentos.R;
import com.example.yoso.superalimentos.pojo.Producto;

import java.util.ArrayList;

/**
 * BBDD
 * Created by yoso on 23/04/17.
 */

public class BaseDatosProductos  extends SQLiteOpenHelper{
    // Crear el contexto
    private Context context;

    // Constructor
    public BaseDatosProductos(Context context) {
        super(context,  ConstantesBaseDatosProductos.DATABASE_NAME, null, ConstantesBaseDatosProductos.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String queryCrearTablaProducto = "CREATE TABLE " + ConstantesBaseDatosProductos.TABLE_PRODUCTO + "(" +
                ConstantesBaseDatosProductos.TABLE_PRODUCTO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE + " TEXT, " +
                ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD + " INTEGER, " +
                ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO + " FLOAT, " +
                ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO + " INTEGER, " +
                ")";

        db.execSQL(queryCrearTablaProducto);

        insertarLasMascota(db);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try{
            db.execSQL("DROP TABLE IF EXISTS " + ConstantesBaseDatosProductos.TABLE_PRODUCTO);
        } catch (SQLiteException e){
            // Manejo de excepciones
        }

        onCreate(db);
    }

    // Método insertar los productos dummy
    private void insertarLasMascota(SQLiteDatabase db) {

        ContentValues contentValues = new ContentValues();

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Baya Acai");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 32);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 29.90);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_baya_acai_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);


        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Bayas de Goji");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 120);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 18.80);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_bayas_goji_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Bebida Arroz y Coco");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 50);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 3.90);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_bebida_arroz_coco_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Semillas de Chía");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 100);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 10.99);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_chia_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Chlorella");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 69);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 14.80);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_chlorella_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Espelta Hinchada");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 120);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 4.90);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_espelta_hinchada_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Cápsulas de Raíz de Maca");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 36);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 16.95);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_maca_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Moringa Oleifera Cápsulas");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 100);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 14.99);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_moringa_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Aceite de Oliva Virgen Extra");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 250);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 24.90);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_oliva_virgen_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Semillas de Quinoa");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 100);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 15.90);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_quinoa_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Semilla de Lino Dorado");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 220);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 8.20);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_semillas_lino_dorado_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Polvo de Spirulina");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 150);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 9.60);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_spirulina_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_NOMBRE, "Stevia líquida");
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_UNIDAD, 120);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODUCTO_PRECIO, 8.99);
        contentValues.put(ConstantesBaseDatosProductos.TABLE_PRODCUTO_FOTO, R.drawable.img_stevia_min);
        db.insert(ConstantesBaseDatosProductos.TABLE_PRODUCTO, null, contentValues);

    }

    // Método consulta de todos los productos
    public ArrayList<Producto> obtenerTodosLosProductos(){
        ArrayList<Producto> productos = new ArrayList<>();

        String query = "SELECT * FROM " + ConstantesBaseDatosProductos.TABLE_PRODUCTO;
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor registros = db.rawQuery(query, null);

        // Recorrer registros
        while (registros.moveToNext()){
            Producto productoActual = new Producto();
            productoActual.setId(registros.getInt(0));
            productoActual.setNombre(registros.getString(1));
            productoActual.setUnidades(registros.getInt(2));
            productoActual.setPrecio(registros.getInt(3));
            productoActual.setIdDrawable(registros.getInt(4));

            // Rellenar la lista contactos
            productos.add(productoActual);

        }

        // Cerrar conexión
        db.close();

        return productos;
    }


}
