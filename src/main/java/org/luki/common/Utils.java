package org.luki.common;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

import java.awt.*;
import java.awt.geom.Point2D;

public class Utils {
    public static void middle(GL2 gl) {
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(0.0f, 0.0f);
        gl.glVertex2f(0.3f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(0.0f, 0.0f);
        gl.glVertex2f(0.0f, 0.3f);
        gl.glEnd();

        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(0.0f, 0.0f);
        gl.glVertex2f(-0.3f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(0.0f, 0.0f);
        gl.glVertex2f(0.0f, -0.3f);
        gl.glEnd();
    }

    public static void drawCircle(GL2 gl, Color colorOutside,
                                  Color colorInside, Color stroke, Point2D.Float center, float radius) {
        double increment = 2 * Math.PI / 50;
        
        for (double angle = 0; angle < 2 * Math.PI; angle += increment) {
            float x1 = center.x + (float) Math.cos(angle) * radius;
            float y1 = center.y + (float) Math.sin(angle) * radius;
            float x2 = center.x + (float) Math.cos(angle + increment)
                    * radius;
            float y2 = center.y + (float) Math.sin(angle + increment)
                    * radius;

            gl.glBegin(GL.GL_TRIANGLES);
            setColor(gl, colorInside);
            gl.glVertex2d(center.x, center.y);
            setColor(gl, colorOutside);
            gl.glVertex2f(x1, y1);
            gl.glVertex2f(x2, y2);
            gl.glEnd();
        }

        gl.glBegin(GL.GL_LINE_LOOP);

        for (double angle = 0; angle < 2 * Math.PI; angle += increment) {
            float x1 = center.x + (float) Math.cos(angle) * radius;
            float y1 = center.y + (float) Math.sin(angle) * radius;
            float x2 = center.x + (float) Math.cos(angle + increment)
                    * radius;
            float y2 = center.y + (float) Math.sin(angle + increment)
                    * radius;
            setColor(gl, stroke);
            gl.glVertex2f(x1, y1);
            gl.glVertex2f(x2, y2);
        }

        gl.glEnd();
    }

    public static void setColor(GL2 gl, Color color) {
        if (color != null) {
            float red = color.getRed() / 255f;
            float green = color.getGreen() / 255f;
            float blue = color.getBlue() / 255f;
            float alpha = color.getAlpha() / 255f;

            gl.glColor4f(red, green, blue, alpha);
        }
    }
}
