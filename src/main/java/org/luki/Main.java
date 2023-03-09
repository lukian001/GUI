package org.luki;

import com.jogamp.opengl.awt.GLCanvas;
import org.luki.common.MainFrame;
import org.luki.common.Tema;
import org.luki.lab2.Tema2;

public class Main {
    public static void main(String[] args) {
        new MainFrame("Laborator 2", 800, 800) {
            @Override
            public void toBeDrawed(GLCanvas canvas) {
                // adaugat in VM options
                // --add-exports java.base/java.lang=ALL-UNNAMED --add-exports java.desktop/sun.awt=ALL-UNNAMED --add-exports java.desktop/sun.java2d=ALL-UNNAMED
                Tema tm2 = new Tema2(canvas);
                tm2.run();
            }
        };
    }
}
