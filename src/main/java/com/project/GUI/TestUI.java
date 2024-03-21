package com.project.GUI;

import com.project.GUI.Forms.DemoAddForm;
import com.project.GUI.Forms.DemoForm;
import javax.swing.*;


public class TestUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.add(new DemoForm());
//        frame.add(new DemoAddForm());

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
