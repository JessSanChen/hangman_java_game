//Jessica Chen, PanelHang.java, 18 May 2017

import java.io.*;     					 //the File class
import java.util.*;    				    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;

public class Hangman extends JPanel
{
   private JLabel label;
   public Hangman()
   {
      setLayout(new BorderLayout());
      label = new JLabel();
      ImageIcon image = new ImageIcon("hangman0.JPG");
      label.setIcon(image);
      add(label, BorderLayout.CENTER);
   
   }
   
   public void update(int tries) 
   {
      ImageIcon image = new ImageIcon("hangman" + (tries+1) + ".JPG");
      label.setIcon(image);
   }  

}
