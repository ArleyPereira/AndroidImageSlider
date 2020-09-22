package com.example.androidimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SliderView sliderView = findViewById(R.id.sliderView);

        List<Paisagem> paisagemList = new ArrayList<>();
        paisagemList.add(new Paisagem("Image 1", R.drawable.imagem1));
        paisagemList.add(new Paisagem("Image 2", R.drawable.imagem2));
        paisagemList.add(new Paisagem("Image 3", R.drawable.imagem3));
        paisagemList.add(new Paisagem("Image 4", R.drawable.imagem4));
        paisagemList.add(new Paisagem("Image 5", R.drawable.imagem5));

        sliderView.setSliderAdapter(new SliderAdapterExample(paisagemList));
        sliderView.startAutoCycle();
        sliderView.setScrollTimeInSec(4);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);

    }
}