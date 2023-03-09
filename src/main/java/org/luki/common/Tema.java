package org.luki.common;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.awt.GLCanvas;

public abstract class Tema {
    protected GLCanvas canvas;

    public Tema(GLCanvas canvas) {
        this.canvas = canvas;
    }

    protected GL2 getGl() {
        return Utils.getNewGl(canvas);
    }

    public abstract void run();
}
