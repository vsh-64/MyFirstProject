package com.test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label2 {
	
	 public static void main(String[] args) {
	        // Create a JFrame
	        JFrame frame = new JFrame("My Applicationn");

	        // Create a JLabel
	        JLabel label = new JLabel("Hello, World!");
	        label.setBounds(100, 50, 100, 30); // Set position and size

	        // Add label to frame
	        frame.add(label);

	        // Set frame size and make it visible
	        frame.setSize(300, 200); // Width, Height
	        frame.setLayout(null); // Use null layout
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }

}
