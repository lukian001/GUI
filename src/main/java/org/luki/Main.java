package org.luki;

import com.jogamp.opengl.GLAutoDrawable;
import org.luki.common.MainFrame;
import org.luki.common.Tema;
import org.luki.lab2.Tema2;

public class Main {
    public static void main(String[] args) {
        Tema tm = new Tema2();
        new MainFrame("Laborator 2", 800, 800) {
            @Override
            public void toBeDrawed(GLAutoDrawable canvas) {
                tm.run(canvas);
            }
        };
    }
}
