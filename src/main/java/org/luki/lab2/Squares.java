package org.luki.lab2;

import com.jogamp.opengl.GL2;

public class Squares {
    public static void GL_LINES_SQUARE(GL2 gl) {

        //right
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(-0.3f, 0.3f);
        gl.glVertex2f(-0.3f, 0.7f);
        gl.glEnd();

        //bottom
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(-0.3f, 0.3f);
        gl.glVertex2f(-0.7f, 0.3f);
        gl.glEnd();

        //left
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(-0.7f, 0.3f);
        gl.glVertex2f(-0.7f, 0.7f);
        gl.glEnd();

        //top
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(-0.7f, 0.7f);
        gl.glVertex2f(-0.3f, 0.7f);
        gl.glEnd();
    }

    public static void GL_LINES_STRIP_SQUARE(GL2 gl) {
        //bottom
        gl.glBegin(GL2.GL_LINE_STRIP);
        gl.glVertex2f(0.3f, 0.3f);
        gl.glVertex2f(0.7f, 0.3f);
        gl.glEnd();

        //right
        gl.glBegin(GL2.GL_LINE_STRIP);
        gl.glVertex2f(0.7f, 0.3f);
        gl.glVertex2f(0.7f, 0.7f);
        gl.glEnd();

        //top
        gl.glBegin(GL2.GL_LINE_STRIP);
        gl.glVertex2f(0.7f, 0.7f);
        gl.glVertex2f(0.3f, 0.7f);
        gl.glEnd();

        //left
        gl.glBegin(GL2.GL_LINE_STRIP);
        gl.glVertex2f(0.3f, 0.7f);
        gl.glVertex2f(0.3f, 0.3f);
        gl.glEnd();
    }

    public static void GL_LINES_LOOP_SQUARE(GL2 gl) {
        //right
        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex2f(-0.3f, -0.3f);
        gl.glVertex2f(-0.3f, -0.7f);
        gl.glEnd();

        //bottom
        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex2f(-0.3f, -0.7f);
        gl.glVertex2f(-0.7f, -0.7f);
        gl.glEnd();

        //left
        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex2f(-0.7f, -0.7f);
        gl.glVertex2f(-0.7f, -0.3f);
        gl.glEnd();

        //top
        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glVertex2f(-0.7f, -0.3f);
        gl.glVertex2f(-0.3f, -0.3f);
        gl.glEnd();
    }
}
