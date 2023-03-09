package org.luki;

import com.jogamp.opengl.GL2;
import org.luki.common.MainFrame;
import org.luki.common.Utils;
import org.luki.lab2.Tema2;

public class Main {
    public static void main(String[] args) {
        new MainFrame("Laborator 2", 800, 800) {
            @Override
            public void toBeDrawed(GL2 gl) {
                Utils.middle(gl);
                Tema2.patrate(gl);
                Tema2.cerc(gl);
            }
        };
    }
}
