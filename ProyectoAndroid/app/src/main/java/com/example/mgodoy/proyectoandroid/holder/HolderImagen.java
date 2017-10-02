package com.example.mgodoy.proyectoandroid.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.mgodoy.proyectoandroid.R;

/**
 * Created by mgodoy on 01/10/2017.
 */

public class HolderImagen extends RecyclerView.ViewHolder {

    private ImageView item_Imagen;

    private Context context;

    private int SCALE_FACTOR_IMAGE_VIEW = 4;

    public HolderImagen(View itemView)
    {
        super(itemView);

        item_Imagen = itemView.findViewById(R.id.itemImagen);
    }

    public void setDatos(String ubicacionImg, Context context)
    {
        this.context = context;
        Bitmap bitmap = escalarBitmap(ubicacionImg, SCALE_FACTOR_IMAGE_VIEW);
        item_Imagen.setImageBitmap(bitmap);
    }

    public Bitmap escalarBitmap(String uri, Integer factor) {
        BitmapFactory.Options bmOptions = new BitmapFactory.Options();
        bmOptions.inJustDecodeBounds = true;
        bmOptions.inJustDecodeBounds = false;
        bmOptions.inSampleSize = factor;
        bmOptions.inPurgeable = true;
        return rotarBitmap(uri, BitmapFactory.decodeFile(uri, bmOptions));
    }

    private Bitmap rotarBitmap(String Url, Bitmap bitmap) {
        try {
            ExifInterface exifInterface = new ExifInterface(Url);
            int orientacion = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            Matrix matrix = new Matrix();

            if (orientacion == 6) {
                matrix.postRotate(90);
            } else if (orientacion == 3) {
                matrix.postRotate(180);
            } else if (orientacion == 8) {
                matrix.postRotate(270);
            }

            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e) {

        }
        return bitmap;
    }


}
