package com.example.br_scheme_android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SchemeDrawer extends View {

    public SchemeDrawer (Context context) {
        super(context);
    }

    private Paint p = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Table_Object[] table_objects = {
                new Table_Object(1, "tr", "", 0, "-300.5 -0.5", "G1", 6, 3, 1, "60 100", "Rectangle"),
                new Table_Object(2, "tc", "", 0, "-180.5 159.5", "G1", 4, 2, 2, "100 100", "Circle")
        };

        Hall_Object[] hall_objects = {
                new Hall_Object("wr", "", 0, "-380.5 -80.5", "G1", "160 20", "Rectangle"),
                new Hall_Object("wr2", "", 0, "-380.5 -60.5", "G1", "20 380", "Rectangle"),
                new Hall_Object("wr3", "", 0, "-360.5 299.5", "G1", "420 20", "Rectangle"),
                new Hall_Object("wr4", "", 0, "39.5 59.5", "G1", "20 240", "Rectangle"),
                new Hall_Object("wr5", "", 0, "439.5 -60.5", "G1", "20 120", "Rectangle"),
                new Hall_Object("wr6", "", 0, "59.5 59.5", "G1", "180 20", "Rectangle"),
                new Hall_Object("dr", "", 0, "239.5 59.5", "G1", "80 20", "Rectangle"),
                new Hall_Object("wr7", "", 0, "319.5 59.5", "G1", "140 20", "Rectangle"),
                new Hall_Object("wir", "", 0, "-220.5 -80.5", "G1", "80 20", "Rectangle"),
                new Hall_Object("wir2", "", 0, "119.5 -80.5", "G1", "80 20", "Rectangle"),
                new Hall_Object("wr8", "", 0, "-140.5 -80.5", "G1", "260 20", "Rectangle"),
                new Hall_Object("wr9", "", 0, "199.5 -80.5", "G1", "260 20", "Rectangle"),
                new Hall_Object("chr", "", 0, "-340.5 19.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr2", "", 0, "-340.5 59.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr3", "", 0, "-220.5 19.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr4", "", 0, "-220.5 59.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr5", "", 0, "-280.5 119.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr6", "", 0, "-140.5 119.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr7", "", 0, "-220.5 199.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr8", "", 0, "-60.5 199.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr9", "", 0, "-140.5 279.5", "G1", "20 20", "Rectangle"),
                new Hall_Object("chr10", "", 0, "-280.5 -40.5", "G1", "20 20", "Rectangle")
        };

        Group_Array[] group_arrays = {
                new Group_Array("G1", 0, "-380 -80", "840 400", "Rectangle")
        };

        Scheme_Element se = new Scheme_Element(1, "Main", table_objects, hall_objects, group_arrays);

//        p.setStyle(Paint.Style.FILL);
//        p.setColor(Color.rgb(128, 128, 128));
//        canvas.drawPaint(p);

        String hallSize = se.group_arrays[0].Size;
        int hallWidth = Integer.parseInt(hallSize.substring(0, hallSize.indexOf(" ")));
        int hallHeight = Integer.parseInt(hallSize.substring(hallSize.indexOf(" ") + 1));

        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.LTGRAY);

        int right = hallWidth * (MainActivity.width / hallWidth);
        int bottom = hallHeight * (MainActivity.height / hallHeight);
        int left = (MainActivity.width - right);
        int top = (MainActivity.height - bottom);
        canvas.drawRect(left, top, right, bottom, p);

        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.BLACK);

        for (Hall_Object obj : se.hall_objects) {
            if (obj.Key.contains("wr")) {
//                obj.
            }
        }
    }
}
