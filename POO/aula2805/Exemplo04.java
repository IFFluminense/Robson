import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;
import javax.swing.*;

class Exemplo04 extends JFrame implements ActionListener, FocusListener {
    JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11;
    JLabel L1, L2, L3;
    JTextField T1, T2, T3;
    

    public static void main(String args[]) {
        JFrame Janela = new Exemplo04();
        Janela.setVisible(true);
    }

   
    Exemplo04(){
        setTitle("Calculadora");
        setSize(350, 200);
        setLocation(50, 50);
        getContentPane().setBackground(new Color(150, 150, 150));
        getContentPane().setLayout(new GridLayout(3, 6));
        L1 = new JLabel("Num.1");
        L1.setForeground(Color.black);
        L1.setFont(new Font("", Font.BOLD, 14));
        L2 = new JLabel("Num.2");
        L2.setForeground(Color.black);
        L2.setFont(new Font("", Font.BOLD, 14));
        L3 = new JLabel("Total");
        L3.setFont(new Font("", Font.BOLD, 14));
        B1 = new JButton("+");
        B1.addActionListener(this);
        B2 = new JButton("-");
        B2.addActionListener(this);
        B3 = new JButton("x");
        B3.addActionListener(this);
        B4 = new JButton("/");
        B4.addActionListener(this);
        B5 = new JButton("Limpar");
        B5.addActionListener(this);
        B5.setBackground(Color.black);
        B5.setForeground(Color.white);
        B6 = new JButton("√");
        B6.addActionListener(this);
        B6.setEnabled(false);
        B7 = new JButton("∛");
        B7.addActionListener(this);
        B7.setEnabled(false);
        B8 = new JButton("^");
        B8.addActionListener(this);      
        B9 = new JButton("sen");
        B9.addActionListener(this);
        B9.setEnabled(false);        
        B10 = new JButton("cos");
        B10.addActionListener(this);
        B10.setEnabled(false);        
        B11 = new JButton("tan");
        B11.addActionListener(this);
        B11.setEnabled(false);
        T1 = new JTextField();
        T2 = new JTextField();
        T3 = new JTextField();
        T3.setEditable(false);
        getContentPane().add(L1);
        getContentPane().add(T1);
        getContentPane().add(B1);
        getContentPane().add(B6);
        getContentPane().add(B9);
        getContentPane().add(B3);
        getContentPane().add(L2);
        getContentPane().add(T2);
        getContentPane().add(B2);
        getContentPane().add(B4);
        getContentPane().add(B7);
        getContentPane().add(B10);
        getContentPane().add(L3);
        getContentPane().add(B5);
        getContentPane().add(T3);
        getContentPane().add(B8);
        getContentPane().add(B11);
        desabilitarTodosOsBotoes();
        T1.addFocusListener(this);
        T2.addFocusListener(this);
    }
   
   
   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B5) {
            T1.setText("");
            T2.setText("");
            T3.setText("");
            desabilitarTodosOsBotoes();
           
            return;
        }

        double N1 = 0, N2 = 0, a = 0, result = 0;
        try {
            N1 = Double.parseDouble(T1.getText());
            if (!T1.getText().isEmpty() && !T2.getText().isEmpty()) {
                habilitarTodosOsBotoes();
            }
            if (e.getSource() != B6 && e.getSource() != B7) {
                N2 = Double.parseDouble(T2.getText());
            }
        } catch (NumberFormatException erro) {
            T3.setText("Erro");
            return;
        }

        if (e.getSource() == B1) {
            result = N1 + N2;
        }
        if (e.getSource() == B2) {
            result = N1 - N2;
        }
        if (e.getSource() == B3) {
            result = N1 * N2;
        }
        if (e.getSource() == B4) {
            result = N1 / N2;
        }
        if (e.getSource() == B6) {
            result = (double) Math.sqrt(N1);
            B5.setEnabled(true);
        }
        if (e.getSource() == B7) {
            result = (double) Math.cbrt(N1);
            B5.setEnabled(true);
        }
        if (e.getSource() == B8) {
            result = (double) Math.pow(N1, N2);
        }
        if (e.getSource() == B9) {
            a= (double) N1;
            result = (double) Math.sin(N1);
            B5.setEnabled(true);
        }
        if (e.getSource() == B10) {
            a= N1 * (double)Math.PI/180;
            result = Math.cos(N1);
            B5.setEnabled(true);
        }
        if (e.getSource() == B11) {
            result = (double) Math.tan(Math.toRadians(N1));
            B5.setEnabled(true);
        }
        if (N2 == 0 && e.getSource() == B4){
                T3.setText("Invalido");
            }else{
                T3.setText("" + result);
            }
            try {
           
            if (N2 != 0 && e.getSource() == B4) {
                T3.setText("" + result);
            }

        } catch (NumberFormatException erro) {
            T3.setText("IMPOSSIVEL DIVIDIR POR ZERO");
            return;
        }

    }

   
    public void focusLost(FocusEvent e) {
        if (T1.getText().isEmpty() && T2.getText().isEmpty()) {
            desabilitarTodosOsBotoes();
        } else if (!T1.getText().isEmpty() && T2.getText().isEmpty()) {
            B6.setEnabled(true);
            B7.setEnabled(true);
            B9.setEnabled(true);
           B10.setEnabled(true);
            B11.setEnabled(true);
            T2.setEditable(true);
        } else {
            habilitarTodosOsBotoes();
        }
    }

   
    private void desabilitarTodosOsBotoes() {
        B1.setEnabled(false);
        B2.setEnabled(false);
        B3.setEnabled(false);
        B4.setEnabled(false);
        B5.setEnabled(false);
        B6.setEnabled(false);
        B7.setEnabled(false);
        B8.setEnabled(false);
        B9.setEnabled(false);
        B10.setEnabled(false);
        B11.setEnabled(false);
        T2.setEditable(false);
    }

   
    private void habilitarTodosOsBotoes() {
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(false);
        B7.setEnabled(false);        
        B8.setEnabled(true);
        B9.setEnabled(false);
        B10.setEnabled(false);
        B11.setEnabled(false);
    }
   
   
    private void habilitarOsBotoes(){
        B6.setEnabled(true);
        B7.setEnabled(true);
        B9.setEnabled(true);
        B10.setEnabled(true);
        B11.setEnabled(true);
    }

    public void focusGained(FocusEvent e) {
        T3.setText("Ola");
        }
}

