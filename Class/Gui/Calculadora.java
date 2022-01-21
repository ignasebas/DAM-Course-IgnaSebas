package Gui;
import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {

    private float primerinput, segundoinput, resultado;
    private String operador;
    private JLabel label, label2;
    private JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonsuma, botonresta, botonmulti, botondivision, botonpunto, botonIgual, botonC;

    public static Float resolver(float x, float z, String y){
        float resultado;
        switch(y){
            case "+":
                resultado = x + z;
                break;
            case "-":
                resultado = x - z;
                break;
            case "/":
                resultado = x / z;
                break;
            case "x":
                resultado = x * z;
                break;
            default:
                resultado = z;
        }
        return resultado;
    }
    public Calculadora(){
        setLayout(null);

        label = new JLabel();
        label2 = new JLabel();
        boton1 = new JButton("1");
        boton1.addActionListener(this);
        boton2 = new JButton("2");
        boton2.addActionListener(this);
        boton3 = new JButton("3");
        boton3.addActionListener(this);
        boton4 = new JButton("4");
        boton4.addActionListener(this);
        boton5 = new JButton("5");
        boton5.addActionListener(this);
        boton6 = new JButton("6");
        boton6.addActionListener(this);
        boton7 = new JButton("7");
        boton7.addActionListener(this);
        boton8 = new JButton("8");
        boton8.addActionListener(this);
        boton9 = new JButton("9");
        boton9.addActionListener(this);
        boton0 = new JButton("0");
        boton0.addActionListener(this);
        botonsuma = new JButton("+");
        botonsuma.addActionListener(this);
        botonresta = new JButton("-");
        botonresta.addActionListener(this);
        botonmulti = new JButton("x");
        botonmulti.addActionListener(this);
        botondivision = new JButton("/");
        botondivision.addActionListener(this);
        botonpunto = new JButton(".");
        botonpunto.addActionListener(this);
        botonIgual = new JButton("=");
        botonIgual.addActionListener(this);
        botonC = new JButton("C");
        botonC.addActionListener(this);

        label.setBounds(100,0,310,50);
        label.setBackground(new java.awt.Color(255,255,255));
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);

        label2.setBounds(0,0,100,50);
        label2.setBackground(new java.awt.Color(255,255,255));
        label2.setOpaque(true);
        label2.setHorizontalAlignment(JLabel.CENTER);

        botonC.setBounds(0,50,100,50);
        botondivision.setBounds(100,50,100,50);
        botonmulti.setBounds(200,50,100,50);
        botonresta.setBounds(300,50,100,50);
        boton7.setBounds(0,100,100,50);
        boton8.setBounds(100,100,100,50);
        boton9.setBounds(200,100,100,50);
        botonsuma.setBounds(300,100,100,100);
        boton4.setBounds(0,150,100,50);
        boton5.setBounds(100,150,100,50);
        boton6.setBounds(200,150,100,50);
        boton1.setBounds(0,200,100,50);
        boton2.setBounds(100,200,100,50);
        boton3.setBounds(200,200,100,50);
        botonIgual.setBounds(300,200,100,100);
        boton0.setBounds(0,250,200,50);
        botonpunto.setBounds(200,250,100,50);

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        add(boton0);
        add(botonsuma);
        add(botonresta);
        add(botonmulti);
        add(botondivision);
        add(botonpunto);
        add(botonIgual);
        add(botonC);
        add(label);
        add(label2);

    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource() == boton0){
            this.label.setText(this.label.getText() + "0");
        }
        if(event.getSource() == boton1){
            this.label.setText(this.label.getText() + "1");
        }
        if(event.getSource() == boton2){
            this.label.setText(this.label.getText() + "2");
        }
        if(event.getSource() == boton3){
            this.label.setText(this.label.getText() + "3");
        }
        if(event.getSource() == boton4){
            this.label.setText(this.label.getText() + "4");
        }
        if(event.getSource() == boton5){
            this.label.setText(this.label.getText() + "5");
        }
        if(event.getSource() == boton6){
            this.label.setText(this.label.getText() + "6");
        }
        if(event.getSource() == boton7){
            this.label.setText(this.label.getText() + "7");
        }
        if(event.getSource() == boton8){
            this.label.setText(this.label.getText() + "8");
        }
        if(event.getSource() == boton9){
            this.label.setText(this.label.getText() + "9");
        }
        if(event.getSource() == botonC){
            this.label.setText("");
            this.label2.setText("");
        }
        if(event.getSource() == botonpunto){
            if(!(this.label.getText().contains("."))){
                this.label.setText(this.label.getText() + ".");
            }
        }

        if(event.getSource() == botonsuma){
            primerinput = Float.parseFloat(this.label.getText());
            operador = "+";
            this.label2.setText(this.label.getText() + " + ");
            this.label.setText("");
        }
        if(event.getSource() == botonresta){
            primerinput = Float.parseFloat(this.label.getText());
            operador = "-";
            this.label2.setText(this.label.getText() + " - ");
            this.label.setText("");
        }
        if(event.getSource() == botonmulti){
            primerinput = Float.parseFloat(this.label.getText());
            operador = "x";
            this.label2.setText(this.label.getText() + " x ");
            this.label.setText("");
        }
        if(event.getSource() == botondivision){
            primerinput = Float.parseFloat(this.label.getText());
            operador = "/";
            this.label2.setText(this.label.getText() + " / ");
            this.label.setText("");
        }
        if(event.getSource() == botonIgual){
            segundoinput = Float.parseFloat(this.label.getText());
            if(operador != ""){
                this.label2.setText(this.label2.getText() + this.label.getText() + " = ");
                resultado = resolver(primerinput, segundoinput, operador);
                operador = "";
                this.label.setText(String.valueOf(resultado));
            }
        }
    }

    public static void main(String[] args){
        Calculadora swingEjemplo1 = new Calculadora ();
        swingEjemplo1.setBounds(10,10,410,340);
        swingEjemplo1.setVisible(true);
    }
}
