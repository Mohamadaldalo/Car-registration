package com.mycompany.projectlab;

public class Projectlab {

    public static void main(String[] args) {

        // Open the Car Registration Form
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CarForm().setVisible(true);
            }
        });
    }
}
