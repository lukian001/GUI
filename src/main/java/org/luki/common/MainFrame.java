package org.luki.common;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.fixedfunc.GLMatrixFunc;
import com.jogamp.opengl.util.Animator;

import javax.swing.*;

public abstract class MainFrame
        extends JFrame
        implements GLEventListener {
    private final double v_size = 1.0;
    private Animator animator;
    private GLCanvas canvas;

    public MainFrame(String dialogTitle, int sizeX, int sizeY) {
        super(dialogTitle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(sizeX, sizeY);
        this.initializeJogl();
        this.setVisible(true);
    }

    private void initializeJogl() {
        GLProfile glprofile = GLProfile.getDefault();
        GLCapabilities capabilities = new GLCapabilities(glprofile);
        capabilities.setHardwareAccelerated(true);
        capabilities.setDoubleBuffered(true);
        capabilities.setNumSamples(2);
        capabilities.setSampleBuffers(true);
        this.canvas = new GLCanvas(capabilities);
        this.animator = new Animator(this.canvas);
        this.animator.start();
        this.getContentPane().add(this.canvas);
        this.canvas.addGLEventListener(this);

    }

    @Override
    public void init(GLAutoDrawable canvas) {
        GL2 gl = canvas.getGL().getGL2();
        gl.glClearColor(0, 0, 0, 0);
        gl.glMatrixMode(GLMatrixFunc.GL_MODELVIEW);
    }

    @Override
    public void display(GLAutoDrawable canvas) {
        toBeDrawed(canvas);
    }

    public abstract void toBeDrawed(GLAutoDrawable canvas);

    @Override
    public void reshape(GLAutoDrawable canvas, int left, int top, int width, int height) {
        GL2 gl = canvas.getGL().getGL2();
        gl.glViewport(0, 0, width, height);
        double ratio = (double) width / (double) height;
        gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
        gl.glLoadIdentity();
        if (ratio < 1)
            gl.glOrtho(-v_size, v_size, -v_size, v_size / ratio, -1, 1);
        else
            gl.glOrtho(-v_size, v_size * ratio, -v_size, v_size, -1, 1);
        gl.glMatrixMode(GLMatrixFunc.GL_MODELVIEW);
    }

    @Override
    public void dispose(GLAutoDrawable arg0) {
    }
}