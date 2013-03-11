package com.diderotproject.client.SimpleGUI;


import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;


public class SimpleDiderotGUI {
	
	  public static class SimpleNotePanel extends JPanel {
		
		JLabel UID;
		JLabel Author;
		
		SimpleNotePanel(){
			
			super();
			
			JLabel UID = new JLabel("UID : ");
			JLabel Author = new JLabel("Author : ");
			
			this.setPreferredSize(new Dimension(550, 50));
			
			this.add(UID);
			this.add(Author);

			
		}
		
		setUID( String UID ){
			
			
		}

	 }
	
	 public static void setupMenu(JFrame frame) {
	        
	        // make menus
	        
	        JMenuBar menuBar;
	        JMenu menu, submenu;
	        JMenuItem menuItem;
	        JRadioButtonMenuItem rbMenuItem;
	        JCheckBoxMenuItem cbMenuItem;
	 
	        //Create the menu bar.
	        menuBar = new JMenuBar();

	        //Build the first menu.
	        menu = new JMenu("Server");
	        menuBar.add(menu);

	        //a group of JMenuItems
	        menuItem = new JMenuItem("Create New Nym");
	        menu.add(menuItem);
	        
	        menuItem = new JMenuItem("Connect To Server");
	        menu.add(menuItem);

	        
	        //Build second menu in the menu bar.
	        menu = new JMenu("Trust List");
	        menuBar.add(menu);
	        
	        menuItem = new JMenuItem("View Trust List");
	        menu.add(menuItem);
	        
	        
	        //Build third menu in the menu bar.
	        menu = new JMenu("Encyclopedia");
	        menuBar.add(menu);
	        
	        menuItem = new JMenuItem("Search...");
	        menu.add(menuItem);
	        
	        menu = new JMenu("About");
	        menuBar.add(menu);
	        
	        menuItem = new JMenuItem("about Diderot...");
	        menu.add(menuItem);

	        frame.setJMenuBar(menuBar);
	        
	    }

	 public static void setupEditorPane(JFrame frame){
		 
		 JEditorPane editorPane = new JEditorPane();
		 editorPane.setEditable(true);

		 //Put the editor pane in a scroll pane.
		 JScrollPane editorScrollPane = new JScrollPane(editorPane);
		 editorScrollPane.setVerticalScrollBarPolicy(
		                 JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		 editorScrollPane.setPreferredSize(new Dimension(550, 500));
		 editorScrollPane.setMinimumSize(new Dimension(10, 10));
		 
		 frame.add(editorScrollPane);
		 
	 }
	 
	 private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Diderot 0.1");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Set up the content pane.
	        setupMenu(frame);
	       
	        //setupEditorPane(frame);
	        
	        frame.add( new SimpleNotePanel() );
	        	        
	        //Size and display the window.
	        Insets insets = frame.getInsets();
	        frame.setSize(600 + insets.left + insets.right,
	                      800 + insets.top + insets.bottom);
	        frame.setVisible(true);
	    }
	 
	public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }

}
