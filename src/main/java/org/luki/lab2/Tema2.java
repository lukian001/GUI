package org.luki.lab2;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.awt.GLCanvas;
import org.luki.common.Tema;
import org.luki.common.Utils;

public class Tema2 extends Tema {
    public Tema2(GLCanvas canvas) {
        super(canvas);
    }

    public void cerc(GL2 gl) {
        gl.glColor3f(1.0f, 0.0f, 0.0f);
        Utils.drawCircle(gl, 0.5f, -0.5f, 0.2f);
    }

    @Override
    public void run() {
        GL2 gl = getGl();
        patrate(gl);
        cerc(gl);
    }

    public void patrate(GL2 gl) {
        gl.glColor3f(1.0f, 0.6f, 0.0f);
        Squares.GL_LINES_SQUARE(gl);
        Squares.GL_LINES_STRIP_SQUARE(gl);
        Squares.GL_LINES_LOOP_SQUARE(gl);
    }
}
