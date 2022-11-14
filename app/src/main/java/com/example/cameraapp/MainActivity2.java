package com.example.cameraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView click_image_id;
    private static final int pic_id = 123;
    public Bitmap org_bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        click_image_id = findViewById(R.id.click_image);


    }
//    // This method will help to retrieve the image
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        // Match the request 'pic id with requestCode
//        if (requestCode == pic_id) {
//            // BitMap is data structure of image file which store the image in memory
//            Bitmap photo = (Bitmap) data.getExtras().get("data");
//            // Set the image in imageview for display
//            click_image_id.setImageBitmap(photo);
//        }
//    }
}