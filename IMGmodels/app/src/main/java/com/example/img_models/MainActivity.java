package com.example.img_models;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.img_models.Adapters.ProductoAdaptador;
import com.example.img_models.Models.Producto;
import com.example.img_models.helpers.QueueUtils;

public class MainActivity extends AppCompatActivity {
    QueueUtils.QueueObject queue=null;
    ListView productoList;
    ProductoAdaptador productoAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue=QueueUtils.getInstance(this.getApplicationContext());

        productoList = findViewById(R.id.productoList);

        productoAdaptador = new ProductoAdaptador(this, Producto.getCollection(),queue.getImageLoader());
       productoList.setAdapter(productoAdaptador);

     productoAdaptador = new ProductoAdaptador(this, Producto.getCollection(),queue.getImageLoader());
    }

}
