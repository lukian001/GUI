package org.luki.lab2;

import com.jogamp.opengl.GL2;

public class Squares {
    public static void GL_LINES_SQUARE(GL2 gl) {

        //right
        gl.glBegin(GL2.GL_LINES);
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex2f(-0.3f, 0.3f);
        gl.glColor3f(0.5f, 0.0f, 0.0f);
        gl.glVertex2f(-0.3f, 0.7f);

        //bottom
        gl.glColor3f(1.f, 0.0f, 0.0f);
        gl.glVertex2f(-0.3f, 0.3f);
        gl.glColor3f(0.f, 0.5f, 0.0f);
        gl.glVertex2f(-0.7f, 0.3f);

        //left
        gl.glColor3f(0.f, 1.f, 0.0f);
        gl.glVertex2f(-0.7f, 0.3f);
        gl.glColor3f(0.f, 0.f, 0.5f);
        gl.glVertex2f(-0.7f, 0.7f);

        //top
        gl.glColor3f(0.f, 0.f, 1.f);
        gl.glVertex2f(-0.7f, 0.7f);
        gl.glColor3f(0.f, 0.f, 1.f);
        gl.glVertex2f(-0.3f, 0.7f);
        gl.glEnd();
    }

    public static void GL_LINES_STRIP_SQUARE(GL2 gl) {
        //bottom
        gl.glBegin(GL2.GL_LINE_STRIP);
        gl.glColor3f(0.5f, 0.5f, 0.f);
        gl.glVertex2f(0.3f, 0.3f);
        gl.glColor3f(1.f, 0.5f, 0.f);
        gl.glVertex2f(0.7f, 0.3f);

        //right
        gl.glColor3f(.5f, 1.f, 0.f);
        gl.glVertex2f(0.7f, 0.3f);
        gl.glColor3f(1.f, 1.f, 0.f);
        gl.glVertex2f(0.7f, 0.7f);

        //top
        gl.glColor3f(.5f, .5f, .5f);
        gl.glVertex2f(0.7f, 0.7f);
        gl.glColor3f(.5f, .5f, 1.f);
        gl.glVertex2f(0.3f, 0.7f);

        //left
        gl.glColor3f(1.f, .5f, 1.f);
        gl.glVertex2f(0.3f, 0.7f);
        gl.glColor3f(1.f, 1.f, 1.f);
        gl.glVertex2f(0.3f, 0.3f);
        gl.glEnd();
    }

    public static void GL_LINES_LOOP_SQUARE(GL2 gl) {
        //right
        gl.glBegin(GL2.GL_LINE_LOOP);
        gl.glColor3f(1.f, 1.f, .5f);
        gl.glVertex2f(-0.3f, -0.3f);
        gl.glColor3f(.3f, .9f, .5f);
        gl.glVertex2f(-0.3f, -0.7f);

        //bottom
        gl.glColor3f(.7f, .22f, .12f);
        gl.glVertex2f(-0.3f, -0.7f);
        gl.glColor3f(.12f, .82f, .52f);
        gl.glVertex2f(-0.7f, -0.7f);

        //left
        gl.glColor3f(.42f, .22f, .02f);
        gl.glVertex2f(-0.7f, -0.7f);
        gl.glColor3f(.4f, .6f, .0f);
        gl.glVertex2f(-0.7f, -0.3f);

        //top
        gl.glColor3f(.3f, .6f, .6f);
        gl.glVertex2f(-0.7f, -0.3f);
        gl.glColor3f(.2f, .1f, .8f);
        gl.glVertex2f(-0.3f, -0.3f);
        gl.glEnd();
    }
}
