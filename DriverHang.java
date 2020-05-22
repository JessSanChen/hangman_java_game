//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 4.5.2003

import javax.swing.JFrame;
import java.io.*;     					 //the File class
import java.util.*;    				    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DriverHang
{
   public static void main(String[] args) throws Exception
   {
      String level = JOptionPane.showInputDialog("Enter \"easy\", \"medium\", or \"hard\"");
      Scanner scan = new Scanner(new File(level+ ".txt"));
      int size = scan.nextInt();
      int rand = (int)(Math.random()*size);
      String target = "";
      for(int k=0;k<rand;k++)
      {
         target = scan.next();
      }
      
      JFrame frame = new JFrame("Final Project: Hangman");
      frame.setSize(500, 500);
      frame.setLocation(500, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelHang(target));
      frame.setVisible(true);
         
                  
   }
}