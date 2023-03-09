package org.luki.lab2;

import com.jogamp.opengl.GL2;
import org.luki.common.Utils;

import java.awt.*;
import java.awt.geom.Point2D;

public class Tema2 {
    public static void patrate(GL2 gl) {
        Squares.GL_LINES_SQUARE(gl);
        Squares.GL_LINES_STRIP_SQUARE(gl);
        Squares.GL_LINES_LOOP_SQUARE(gl);
    }


    public static void cerc(GL2 gl) {
        Utils.drawCircle(gl, Color.BLACK, Color.BLACK, Color.WHITE, new Point2D.Float(0.5f, -0.5f), 0.2f);
    }
}
