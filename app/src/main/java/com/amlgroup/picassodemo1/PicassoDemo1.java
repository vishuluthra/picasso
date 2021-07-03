package com.amlgroup.picassodemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoDemo1 extends AppCompatActivity {
    ImageView imv1;

    // Buid.gradel(Module) maven
    // Internet Permission



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_demo1);
        imv1 = findViewById(R.id.imv1);

    }

    public void go (View v){

        Picasso.get().load(R.drawable.five).into(imv1);
    }
    public void go2 (View v)
            // manifest internet permission mandatory
    {
        Picasso.get().load("https://i.gadgets360cdn.com/large/google_android_reuters_1557489952979.JPG?output-quality=80&output-format=webp").into(imv1);


    }
}