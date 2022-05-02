package Gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
 
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

/*
 *Mnemonics offer a way to use the keyboard to navigate the menu hierarchy, 
 *increasing the accessibility of programs. Accelerators, on the other hand, 
 *offer keyboard shortcuts to bypass navigating the menu hierarchy. Mnemonics 
 *are for all users; accelerators are for power users. 
 */

public class BasicFrame implements ActionListener{
    JTextArea output;
    JScrollPane scrollPane;
    String newline = "\n";
 
    public JMenuBar createMenuBar() {
        //Where the GUI is created:
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
 
        //Create the menu bar.
        menuBar = new JMenuBar();
 
        //Build the first menu.
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        
        menuBar.add(menu); //add menu to menuBar
 
        //a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));

        menuItem.addActionListener(this);//...for each JMenuItem instance:
        
        menu.add(menuItem); //add menuItem to menu
        

 
        //a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);
 
        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        menuItem.addActionListener(this);//...for each JMenuItem instance:
        submenu.add(menuItem); //add menuItem to submenu
 
        menuItem = new JMenuItem("Another item");
        menuItem.addActionListener(this);//...for each JMenuItem instance:
        submenu.add(menuItem); //add menuItem to submenu
        
        menu.add(submenu);//add submenu to menu
 
        //Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu);
 
        return menuBar;
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
        if (source.getText() == "A text-only menu item"){
            System.out.println("HOLA");
        }
    }

    private static void createAndShowGUI() {
        //1. Create the frame.
        JFrame frame = new JFrame("BasicFrame");
        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //3. Create components and put them in the frame.
        BasicFrame demo = new BasicFrame();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
 
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