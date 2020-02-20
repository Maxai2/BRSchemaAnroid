package com.example.br_scheme_android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


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

        Scheme_Element scheme_element = new Scheme_Element(1, "MainHall", table_objects, hall_objects, group_arrays);



//        Table_Object[] table_objects = {
//                new Table_Object(1, "tr", "", 0, "-340.5 -40.5", "G1", 6, 3, 1, "60 60", "Rectangle"),
//                new Table_Object(2, "tr2", "", 0, "-340.5 159.5", "G1", 4, 2, 2, "60 60", "Rectangle"),
//                new Table_Object(2, "tc", "", 0, "-140.5 159.5", "G1", 4, 2, 2, "60 60", "Circle"),
//                new Table_Object(2, "tr2", "", 0, "239.5 -60.5", "G1", 4, 2, 2, "60 60", "Rectangle"),
//                new Table_Object(2, "tc3", "", 0, "-0.5 39.5", "G1", 4, 2, 2, "60 60", "Circle"),
//                new Table_Object(1, "tr", "", 0, "99.5 199.5", "G1", 6, 3, 1, "60 60", "Rectangle"),
//                new Table_Object(2, "tc", "", 0, "-140.5 -80.5", "G1", 4, 2, 2, "60 60", "Circle"),
//        };
//
//        Hall_Object[] hall_objects = {
//                new Hall_Object("wr", "", 0, "-420.5 -120.5", "G1", "20 420", "Rectangle"),
//                new Hall_Object("wr2", "", 0, "-400.5 -120.5", "G1", "140 20", "Rectangle"),
//                new Hall_Object("wr3", "", 0, "--180.5 -120.5", "G1", "340 20", "Rectangle"),
//                new Hall_Object("wr4", "", 0, "239.5 -120.5", "G1", "120 20", "Rectangle"),
//                new Hall_Object("wr5", "", 0, "339.5 -100.5", "G1", "20 140", "Rectangle"),
//                new Hall_Object("wr6", "", 0, "-20.5 279.5", "G1", "200 20", "Rectangle"),
//                new Hall_Object("wr", "", 0, "-400.5 279.5", "G1", "240 20", "Rectangle"),
//                new Hall_Object("wr", "", 0, "179.5 139.5", "G1", "20 160", "Rectangle"),
//                new Hall_Object("wr", "", 0, "199.5 139.5", "G1", "160 20", "Rectangle"),
//
//
//                new Hall_Object("wir", "", 0, "-260.5 -120.5", "G1", "80 20", "Rectangle"),
//                new Hall_Object("wir2", "", 0, "-160.5 279.5", "G1", "140 20", "Rectangle"),
//                new Hall_Object("wir2", "", 0, "159.5 -120.5", "G1", "80 20", "Rectangle"),
//
//                new Hall_Object("dr", "", 0, "339.5 39.5", "G1", "20 100", "Rectangle"),
//
//                new Hall_Object("chr", "", 0, "-380.5 -20.5", "G1", "20 20", "Rectangle"),
//
//
//                new Hall_Object("chr2", "", 0, "-320.5 -80.5", "G1", "20 20", "Rectangle"),
//
//                new Hall_Object("chr3", "", 0, "-260.5 -20.5", "G1", "20 20", "Rectangle"),
//
//                new Hall_Object("chr4", "", 0, "-320.5 39.5", "G1", "20 20", "Rectangle"),
//
//                new Hall_Object("chr5", "", 0, "-320.5 239.5", "G1", "20 20", "Rectangle"),
//
//                new Hall_Object("chr6", "", 0, "-380.5 179.5", "G1", "20 20", "Rectangle"),
//
//                new Hall_Object("chr7", "", 0, "-320.5 119.5", "G1", "20 20", "Rectangle"),
//
//                new Hall_Object("chr8", "", 0, "-260.5 179.5", "G1", "20 20", "Rectangle"),
//
//                new Hall_Object("chr9", "", 0, "-180.5 179.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr10", "", 0, "-120.5 119.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr11", "", 0, "-120.5 239.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr11", "", 0, "-60.5 179.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr11", "", 0, "119.5 159.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "59.5 219.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-80.5 -100.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-60.5 -60.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-80.5 -20.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-120.5 -0.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-160.5 -20.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-180.5 -60.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-160.5 -100.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "259.5 -100.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "199.5 -40.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "319.5 -40.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "-40.5 59.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "19.5 -0.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "79.5 59.5", "G1", "20 20", "Rectangle"),
//                new Hall_Object("chr14", "", 0, "19.5 119.5", "G1", "20 20", "Rectangle"),
//
//        };
//
//        Group_Array[] group_arrays = {
//                new Group_Array("G1", 0, "-420.5 -120.5", "780 420", "Rectangle")
//        };
//
//        Scheme_Element scheme_element = new Scheme_Element(1, "MainHall", table_objects, hall_objects, group_arrays);





//        p.setStyle(Paint.Style.FILL);
//        p.setColor(Color.rgb(128, 128, 128));
//        canvas.drawPaint(p);
        
        
        boolean isWidthRatio = true;
        ArrayList<Integer> posX = new ArrayList<Integer>();
        ArrayList<Integer> posY = new ArrayList<Integer>();

        String hallSize = scheme_element.group_arrays[0].Size;
        double hallWidth = Double.parseDouble(hallSize.substring(0, hallSize.indexOf(" ")));
        double hallHeight = Double.parseDouble(hallSize.substring(hallSize.indexOf(" ") + 1));

        double ratio =  (double)MainActivity.width / hallWidth;

        if(hallHeight * ratio > MainActivity.height) {
            ratio = (double)MainActivity.height / hallHeight;
            isWidthRatio = false;
        }
//        if(hallWidth/hallHeight > (double)MainActivity.width/MainActivity.height) {
//            ratio*= MainActivity.height/hallHeight;
//        }

        for (Group_Array group: scheme_element.group_arrays) {
            posX.add(Integer.parseInt(group.Pos.substring(0, group.Pos.indexOf(" "))));
            posY.add(Integer.parseInt(group.Pos.substring(group.Pos.indexOf(" ") + 1)));
        }

        double toAdd;
        if(isWidthRatio) {
            double a1 = this.GetHeight(scheme_element.group_arrays[0].Size);
            double a2 = a1 * ratio;
            double a3 = MainActivity.height - a2;
            double a4 = a3 / 2;
            toAdd = (MainActivity.height - (this.GetHeight(scheme_element.group_arrays[0].Size)*ratio)) / 2;
        } else {
            double a1 = this.GetWidth(scheme_element.group_arrays[0].Size);
            double a2 = a1 * ratio;
            double a3 = MainActivity.width - a2;
            double a4 = a3 / 2;
            toAdd = (MainActivity.width - (this.GetWidth(scheme_element.group_arrays[0].Size)*ratio)) / 2;
        }
        double offsetX = isWidthRatio ? Collections.min(posX) * -1 : Collections.min(posX) * -1 + toAdd;
        double offsetY = isWidthRatio ? Collections.min(posY) * -1 + toAdd : Collections.min(posY) * -1;








        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.LTGRAY);


//        int right = hallWidth * (MainActivity.width / hallWidth);
//        int bottom = hallHeight * (MainActivity.height / hallHeight);
//        int left = (MainActivity.width - right);
//        int top = (MainActivity.height - bottom);
//        canvas.drawRect(left, top, right, bottom, p);


        double left = this.GetX(scheme_element.group_arrays[0].Pos) + offsetX;
        double top = this.GetY(scheme_element.group_arrays[0].Pos) + offsetY;
        double right = left + hallWidth * ratio;
        double bottom = top + hallHeight * ratio;


        canvas.drawRect((int)left, (int)top, (int)right, (int)bottom, p);

        //p.setStyle(Paint.Style.STROKE);
        //p.setColor(Color.BLACK);

        double startX = left;
        double startY = top;

        for (Hall_Object obj : scheme_element.hall_objects) {

            if(obj.Key.startsWith("wi")){
                p.setColor(Color.rgb(228, 240, 245));

            }
            // walls
            else if (obj.Key.startsWith("w")){
                p.setColor(Color.rgb(21,1,3));
            }
            // chairs
            else if(obj.Key.startsWith("ch")){
                p.setColor(Color.rgb(3,200,0));
            }
            // doors
            else if(obj.Key.startsWith("d")){
                p.setColor(Color.rgb(255,253,141));
            }
            // rectangle
            if (obj.Figure.equals("Rectangle")) {
                double l = startX + (this.GetX(obj.Pos) + offsetX - startX)* ratio;
                double t = startY + (this.GetY(obj.Pos) + offsetY - startY) * ratio;
                double r = l + this.GetWidth(obj.Size) * ratio;
                double b = t + this.GetHeight(obj.Size) * ratio;
                canvas.drawRect((int)l, (int)t, (int)r, (int)b, p);
            }

            // circle
            else {

            }

        }
        p.setColor(Color.rgb(93, 23, 65));
        for (Table_Object table : scheme_element.table_objects) {

            if (table.Figure.equals("Rectangle")) {
                double l = startX + (this.GetX(table.Pos) + offsetX - startX)* ratio;
                double t = startY + (this.GetY(table.Pos) + offsetY - startY) * ratio;
                double r = l + this.GetWidth(table.Size) * ratio;
                double b = t + this.GetHeight(table.Size) * ratio;
                canvas.drawRect((int)l, (int)t, (int)r, (int)b, p);
            }
            else {

                double radius = (this.GetWidth(table.Size) * ratio) / 2;
                double centerX = startX + (this.GetX(table.Pos) + offsetX - startX)* ratio + radius;
                double centerY = startY + (this.GetY(table.Pos) + offsetY - startY) * ratio + radius;

                p.setAntiAlias(true);

                canvas.drawCircle((int)centerX, (int)centerY, (int)radius, p);
            }
        }
    }

    public double GetX(String pos){
        return Double.parseDouble(pos.substring(0, pos.indexOf(" ")));
    }

    public double GetY(String pos) {
        return Double.parseDouble(pos.substring(pos.indexOf(" ") + 1));
    }

    public double GetWidth(String size){
        return Double.parseDouble(size.substring(0, size.indexOf(" ")));
    }

    public double GetHeight(String size){
        return Double.parseDouble(size.substring(size.indexOf(" ") + 1));
    }
}
