package com.example.yoso.superalimentos.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.yoso.superalimentos.R;

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


}
