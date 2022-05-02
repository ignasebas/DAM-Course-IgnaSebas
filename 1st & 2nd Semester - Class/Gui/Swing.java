package Gui;
import javax.swing.*;
import java.awt.event.*;

public class Swing extends JFrame implements ActionListener {

    private JLabel label1, label2, labelUsuario, labelPassword;
    private JTextField txtUsuario, txtPassword;
    private JButton botonAceptar, botonCerrar;

    public Swing(){
        setLayout(null);

        labelUsuario = new JLabel("Usuario");
        labelUsuario.setBounds(30,80,150,20);
        add(labelUsuario);

        labelPassword = new JLabel("Password");
        labelPassword.setBounds(30,110,150,20);
        add(labelPassword);

        label1 = new JLabel("Operador 1");
        label1.setBounds(10,295,200,30);
        add(label1);

        label2 = new JLabel("Operador 2");
        label2.setBounds(10,350,200,30);
        add(label2);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120,80,150,20);
        add(txtUsuario);

        txtPassword = new JTextField();
        txtPassword.setBounds(120,110,150,20);
        add(txtPassword);

        botonAceptar = new JButton("Aceptar");
        botonAceptar.setBounds(20,200,100,20);
        add(botonAceptar);
        botonAceptar.addActionListener(this);

        botonCerrar = new JButton("Cerrar");
        botonCerrar.setBounds(200,200,100,20);
        add(botonCerrar);
        botonCerrar.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource() == botonCerrar){
            System.exit(0);
        }
        if(event.getSource() == botonAceptar){
            String usuario = txtUsuario.getText();
            String contraseña = txtPassword.getText();
            System.out.println("HOla");
            System.out.println(usuario + contraseña);
        }
    }

    public static void main(String[] args){
        Swing swingEjemplo1 = new Swing();
        swingEjemplo1.setBounds(10,10,500,500);
        swingEjemplo1.setVisible(true);
    }
}
