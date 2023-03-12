package org.luki.lab2;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import org.luki.common.Punct;
import org.luki.common.Tema;
import org.luki.common.Utils;

public class Tema2 extends Tema {
    float centerX = 0.0f;
    float centerY = 0.8f;
    float radius = 0.1f;
    float direction = 1.0f;
    float speed = 0.01f;

    public void circle(GL2 gl) {
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        Utils.drawCircle(gl, 0.5f, -0.5f, 0.2f);
    }

    @Override
    public void run(GLAutoDrawable canvas) {
        part2(canvas);
    }

    public void part1(GLAutoDrawable canvas) {
        GL2 gl = Utils.getNewGl(canvas);
        squares(gl);
        circle(gl);
    }

    public void part2(GLAutoDrawable canvas) {
        GL2 gl = Utils.getNewGl(canvas);
        Punct p1 = new Punct(-0.8f, -0.8f);
        Punct p2 = new Punct(-0.4f, -0.8f);
        Punct p3 = new Punct(-0.4f, -0.4f);
        Punct p4 = new Punct(-0.8f, -0.4f);
        Punct p5 = new Punct(-0.6f, -0.1f);
        Punct p6 = new Punct(.2f, -0.6f);
        Punct p7 = new Punct(.2f, -0.2f);
        Punct p8 = new Punct(0f, 0.1f);

        // house
        gl.glColor3f(0f, 1.f, 0.f);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(p1.x, p1.y);
        gl.glVertex2f(p2.x, p2.y);

        gl.glVertex2f(p2.x, p2.y);
        gl.glVertex2f(p3.x, p3.y);

        gl.glVertex2f(p3.x, p3.y);
        gl.glVertex2f(p4.x, p4.y);

        gl.glVertex2f(p4.x, p4.y);
        gl.glVertex2f(p1.x, p1.y);
        gl.glEnd();

        gl.glColor3f(1f, 0f, 0f);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(p4.x, p4.y);
        gl.glVertex2f(p5.x, p5.y);

        gl.glVertex2f(p5.x, p5.y);
        gl.glVertex2f(p3.x, p3.y);
        gl.glEnd();

        gl.glColor3f(0f, 1.f, 0.f);
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2f(p2.x, p2.y);
        gl.glVertex2f(p6.x, p6.y);

        gl.glVertex2f(p6.x, p6.y);
        gl.glVertex2f(p7.x, p7.y);

        gl.glVertex2f(p7.x, p7.y);
        gl.glVertex2f(p3.x, p3.y);

        gl.glColor3f(1f, 0f, 0f);
        gl.glVertex2f(p7.x, p7.y);
        gl.glVertex2f(p8.x, p8.y);

        gl.glVertex2f(p8.x, p8.y);
        gl.glVertex2f(p5.x, p5.y);
        gl.glEnd();

        gl.glColor3f(1, 1, 0);
        Utils.drawCircle(gl, centerX, centerY, radius);

        centerX += direction * speed;
        if (centerX + radius >= 1.0f || centerX - radius <= -1.0f) {
            direction = -direction;
        }
    }

    public void squares(GL2 gl) {
        Squares.GL_LINES_SQUARE(gl);
        Squares.GL_LINES_STRIP_SQUARE(gl);
        Squares.GL_LINES_LOOP_SQUARE(gl);
    }
}
