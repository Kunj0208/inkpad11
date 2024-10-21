package com.example.trafficsignalryo;



import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Bitmap b = Bitmap.createBitmap(1080,1080,Bitmap.Config.ARGB_8888);
    Canvas c;
    ImageView iv;
    Paint p1,p2,p3,p4;
    Button r,y,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = findViewById(R.id.red);
        y = findViewById(R.id.yellow);
        g = findViewById(R.id.green);
        c = new Canvas(b);
        c.drawColor(Color.argb(255,0,0,0));
        iv = findViewById(R.id.imageView);
        p1 = new Paint();
        p2 = new Paint();
        p3 = new Paint();
        p4 = new Paint();
        p1.setARGB(255,0,0,0);
        p2.setARGB(255,255,0,0);
        p3.setARGB(255,255,193,7);
        p4.setARGB(255,76,175,80);

        drawTrafficLights(p1,p1,p1);

        r.setOnClickListener(v -> drawTrafficLights(p2,p1,p1));
        y.setOnClickListener(v -> drawTrafficLights(p1,p3,p1));
        g.setOnClickListener(v -> drawTrafficLights(p1,p1,p4));
    }
    public void drawTrafficLights(Paint x,Paint y,Paint z)
    {
        c.drawCircle(500,100,100,x);
        c.drawCircle(500,400,100,y);
        c.drawCircle(500,700,100,z);
        iv.setImageBitmap(b);
    }
}