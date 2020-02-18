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

        Scheme_Element se = new Scheme_Element(1, "Main", [new Table_Object(1, "tr", "", 0,
                "-300" +
                ".5 -0.5", "G1", 6, 3, 1, "20 20"), new Table_Object()])

        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.rgb(128, 128, 128));
        canvas.drawPaint(p);
    }
}
