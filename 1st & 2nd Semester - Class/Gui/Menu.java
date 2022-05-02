package Gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

/*
 *Mnemonics offer a way to use the keyboard to navigate the menu hierarchy, 
 *increasing the accessibility of programs. Accelerators, on the other hand, 
 *offer keyboard shortcuts to bypass navigating the menu hierarchy. Mnemonics 
 *are for all users; accelerators are for power users. 
 */

public class Menu extends JPanel implements ActionListener{
    JTextArea output;
    JScrollPane scrollPane;
    String newline = "\n";
    
    JLabel label1, label2;

    public JMenuBar createMenuBar() {
        //Where the GUI is created:
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
 
        //Create the menu bar.
        menuBar = new JMenuBar();
 
        //Build the menu Archivo.
        menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu); //add menu to menuBar
 
        //a group of JMenuItems for menu Archivo
        menuItem = new JMenuItem("Nuevo", KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);//...for each JMenuItem instance:
        menu.add(menuItem); //add menuItem to menu

        menuItem = new JMenuItem("Buscar", KeyEvent.VK_B);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);//...for each JMenuItem instance:
        menu.add(menuItem); //add menuItem to menu

        menuItem = new JMenuItem("Nuevo", KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);//...for each JMenuItem instance:
        menu.add(menuItem); //add menuItem to menu
        
 
        //Build the menu Ayuda.
        menu = new JMenu("Ayuda");
        menu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(menu);//add menu to menuBar

        //a group of JMenuItems for menu Ayuda
        menuItem = new JMenuItem("Información", KeyEvent.VK_I);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);//...for each JMenuItem instance:
        menu.add(menuItem); //add menuItem to menu
 
        return menuBar;
    }

	public Menu(int Type){
        super(new GridLayout(2,1));  //3 rows, 1 column

        label1 = new JLabel("Autor: Sebastian Ignacio Kuhnel Bozzo",JLabel.CENTER);
        //Set the position of its text:
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        label2 = new JLabel("Versión: 1.0",JLabel.CENTER);

        //Add the labels.
        add(label1);
        add(label2);
    }

    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);
 
        //Create a scrolled text area.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
 
        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);
 
        return contentPane;
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("ACTION");
        JMenuItem source = (JMenuItem)(e.getSource());
        if (source.getText() == "Nuevo"){
            System.out.println("Nuevo Action");
        }
    }

    private static void createAndShowGUI() {
        //1. Create the frame.
        JFrame frame = new JFrame("BasicFrame");
        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //3. Create components and put them in the frame.
        Menu demo = new Menu(0);
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
        frame.add(new Menu(1));
        //4. Size the frame.
        frame.setSize(450, 260);
        //5. Show it.
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