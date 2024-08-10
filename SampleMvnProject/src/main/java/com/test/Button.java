package com.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Button {
	
	 public static void main(String[] args) {
		        // Create a JFrame
		        final JFrame frame = new JFrame("Button Example");

		        // Create a JButton
		        JButton button = new JButton("Click Me");
		        button.setBounds(100, 100, 120, 40); // Set position and size

		        // Add button to frame
		        frame.add(button);

		        // Add action listener to button
		        button.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                JOptionPane.showMessageDialog(frame, "Button Clicked!");
		            }
		        });

		        // Set frame size and make it visible
		        frame.setSize(300, 200); // Width, Height
		        frame.setLayout(null); // Use null layout
		        frame.setVisible(true);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }
	    }

