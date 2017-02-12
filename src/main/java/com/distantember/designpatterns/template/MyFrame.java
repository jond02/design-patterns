package com.distantember.designpatterns.template;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jondann on 2/12/17.
 */
public class MyFrame extends JFrame {

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Design Patterns");
    }

    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    //hook method
    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "Hello!";
        graphics.drawString(msg, 100, 100);
    }
}
