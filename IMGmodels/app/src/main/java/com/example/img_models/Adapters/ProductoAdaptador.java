package com.example.img_models.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.img_models.Models.Producto;
import com.example.img_models.R;

import java.util.List;
public class ProductoAdaptador extends ArrayAdapter<Producto> {

    Context context;
    ImageLoader queue;
    private class ViewHolder {
        NetworkImageView image;
        TextView nombre;
        TextView categoria;

        private ViewHolder() {
        }
    }
    public ProductoAdaptador(Context context, List<Producto> items,ImageLoader _queue) {
        super(context, 0, items);
        this.context = context;
        this.queue= _queue;
    }
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        final Producto rowItem = (Producto) getItem(position);
        LayoutInflater mInflater = (LayoutInflater) this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.activity_producto_item, null);
            holder = new ViewHolder();
            holder.image=(NetworkImageView)convertView.findViewById(R.id.image);
            holder.nombre = (TextView) convertView.findViewById(R.id.nombre);
            holder.categoria = (TextView) convertView.findViewById(R.id.categoria);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
       holder.image.setImageUrl(rowItem.getSmallImage(),queue);
        holder.nombre.setText(rowItem.Nombre);
        holder.categoria.setText(rowItem.Categoria);
        return convertView;
    }
}
