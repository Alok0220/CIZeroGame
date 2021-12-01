package com.example.sapp.SplashScreen;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class SplashScreen {

    private Bitmap image;

    public SplashScreen(Bitmap bmp){
        this.image = bmp;
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(image, 100, 100, null);
    }
}
