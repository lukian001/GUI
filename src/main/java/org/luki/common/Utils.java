package org.luki.common;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.awt.GLCanvas;

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

    public static void drawCircle(GL2 gl, float centerX, float centerY, float radius) {
        gl.glLineWidth(2.0f);
        gl.glBegin(GL2.GL_LINE_LOOP);
        for (int i = 0; i < 360; i++) {
            float theta = (float) (i * Math.PI / 180);
            float x = centerX + radius * (float) Math.cos(theta);
            float y = centerY + radius * (float) Math.sin(theta);
            gl.glVertex2f(x, y);
        }
        gl.glEnd();
    }

    public static GL2 getNewGl(GLCanvas canvas) {
        GL2 gl = canvas.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
        gl.glFlush();

        return gl;
    }
}
