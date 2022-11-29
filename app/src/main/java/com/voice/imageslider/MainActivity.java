package com.voice.imageslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ActionTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.interfaces.TouchListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    View card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card = findViewById(R.id.card);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Item Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        List<SlideModel> imageList = new ArrayList<>(); // Create image list
        imageList.add(new SlideModel(R.drawable.img1, "Image 1", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img2, "Image 2", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img3, "Image 3", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img4, "Image 4", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img5, "Image 5", ScaleTypes.CENTER_CROP));

        imageSlider.setImageList(imageList);
    }
}