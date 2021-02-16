package com.example.classgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Integer index;
    private ArrayList<Integer> images;
    private TextView count_tv;
    private ImageView main_pic;
    private ImageView left_pic;
    private ImageView center_pic;
    private ImageView right_pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        index = 0;
        images = new ArrayList<>();
        images.add(R.drawable.cup);
        images.add(R.drawable.cup_1);
        images.add(R.drawable.cup_2);
        images.add(R.drawable.cup_3);
        images.add(R.drawable.cup_4);
        images.add(R.drawable.cup_5);
        images.add(R.drawable.cup_6);
        images.add(R.drawable.cup_7);
        images.add(R.drawable.cup_8);
        images.add(R.drawable.cup_9);
        images.add(R.drawable.cup_10);
        images.add(R.drawable.cup_11);
        images.add(R.drawable.cup_12);
        images.add(R.drawable.cup_13);
        images.add(R.drawable.cup_14);
        images.add(R.drawable.cup_15);
        count_tv = findViewById(R.id.textView2);
        main_pic = findViewById(R.id.imageView6);
        left_pic = findViewById(R.id.leftImage);
        center_pic = findViewById(R.id.centerImage);
        right_pic = findViewById(R.id.rightImage);
        MakeChanges();
    }
    public void forwardImage(View v)
    {
        index = (index+1)%images.size();
        MakeChanges();
    }
    public void backImage(View v)
    {
        index -= 1;
        if(index<0)
            index+=images.size();
        MakeChanges();
    }
    private void MakeChanges()
    {
        count_tv.setText(((Integer)(index+1)).toString()+"/"+images.size());
        main_pic.setImageResource(images.get(index));
        left_pic.setImageResource(images.get(index-1+((index<1)?1:0)*images.size()));
        center_pic.setImageResource(images.get(index));
        right_pic.setImageResource(images.get((index+1)%images.size()));
    }
}