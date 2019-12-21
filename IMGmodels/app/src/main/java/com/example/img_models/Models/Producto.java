package com.example.img_models.Models;
import java.util.ArrayList;
public class Producto {
    public String Nombre;
    public String Categoria;
    public String image;

    public Producto(String _nombre, String _categoria,String _image) {
        this.Nombre = _nombre;
        this.Categoria = _categoria;
        this.image = _image;
    }

    public String getSmallImage(){
        return this.image;
    }

    public static ArrayList getCollection() {
        ArrayList<Producto> collection = new ArrayList<>();
        collection.add(new Producto("producto1", "Bichito","https://www.redtienda.com/blog/wp-content/uploads/2014/11/imagenes_silla.jpg"));
        collection.add(new Producto("producto2", "Plaga","https://www.redtienda.com/blog/wp-content/uploads/2014/11/imagenes_silla_mas.jpg"));
        collection.add(new Producto("producto3", "Libelula","https://www.redtienda.com/blog/wp-content/uploads/2014/11/imagenes_aspecto4.jpg"));
        return collection;
    }
}
