import java.awt.*;
import java.awt.event.*;

class calculator implements ActionListener{
    Frame f = new Frame();
    Label l1 = new Label("Primeiro numero: ");
    Label l2 = new Label("Segundo numero: ");
    Label l3 = new Label("Resultado: ");
    
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    
    Button b1 = new Button("Soma");
    Button b2 = new Button("Subtracao");
    Button b3 = new Button("Multiplicacao");
    Button b4 = new Button("Divisao");
    Button b5 = new Button("Factorial");
    Button b6 = new Button("Sine");
    Button b7 = new Button("Cosine");
    Button b8 = new Button("Tangent");
    Button b9 = new Button("Raiz Quadrada");
    Button b10 = new Button("Potencia");
    Button b11 = new Button("LIMPAR");
    Button b12 = new Button("ATUALIZAR");
    
    int buttonWidth = 100;
    int buttonHeight = 30;
    int buttonXStart = 50;
    int buttonYStart = 220;
    int buttonXSpacing = 120;
    int buttonYSpacing = 40;
    
    calculator(){
    l1.setBounds(50,100,100,20);l2.setBounds(50,140,100,20);l3.setBounds(50,180,100,20);
    t1.setBounds(200, 100, 100, 20);t2.setBounds(200, 140, 100, 20);t3.setBounds(200, 180, 100, 20);
    b1.setBounds(buttonXStart, buttonYStart, buttonWidth, buttonHeight);
    b2.setBounds(buttonXStart + buttonXSpacing, buttonYStart, buttonWidth, buttonHeight);
    b3.setBounds(buttonXStart + 2 * buttonXSpacing, buttonYStart, buttonWidth, buttonHeight);
    b4.setBounds(buttonXStart, buttonYStart + buttonYSpacing, buttonWidth, buttonHeight);
    b5.setBounds(buttonXStart + buttonXSpacing, buttonYStart + buttonYSpacing, buttonWidth, buttonHeight);
    b6.setBounds(buttonXStart + 2 * buttonXSpacing, buttonYStart + buttonYSpacing, buttonWidth, buttonHeight);
    b7.setBounds(buttonXStart, buttonYStart + 2 * buttonYSpacing, buttonWidth, buttonHeight);
    b8.setBounds(buttonXStart + buttonXSpacing, buttonYStart + 2 * buttonYSpacing, buttonWidth, buttonHeight);
    b9.setBounds(buttonXStart + 2 * buttonXSpacing, buttonYStart + 2 * buttonYSpacing, buttonWidth, buttonHeight);
    b10.setBounds(buttonXStart, buttonYStart + 3 * buttonYSpacing, buttonWidth, buttonHeight);
    b11.setBounds(buttonXStart + buttonXSpacing, buttonYStart + 3 * buttonYSpacing, buttonWidth, buttonHeight);
    b12.setBounds(buttonXStart + 2 * buttonXSpacing, buttonYStart + 3 * buttonYSpacing, buttonWidth, buttonHeight);
    f.add(l1);f.add(l2);f.add(l3);
    f.add(t1);f.add(t2);f.add(t3);
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
    f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);f.add(b11);f.add(b12);
    
    b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
    b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
    b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
    
    f.setLayout(null);f.setVisible(true);f.setSize(800, 600);f.setLocation(500,200);
    
    f.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
    
    t2.setEnabled(false);
    t3.setEnabled(false);
    }
    
    public void actionPerformed(ActionEvent e){
    //double n1 = Float.parseFloat(t1.getText());
    //double n2 = Float.parseFloat(t2.getText());
    
    double n1;double n2;int state1, state2;
    


    try{n1 = Float.parseFloat(t1.getText()); state1 = 1;} 
    catch (NumberFormatException ex) {n1 = 0.0; state1 = 0;}

    try {n2 = Float.parseFloat(t2.getText()); state2 = 1;//b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true);//b4.setEnabled(true); b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true);//b9.setEnabled(true); b10.setEnabled(true); b11.setEnabled(true);
} catch (NumberFormatException ex) {n2 = 0.0; state2 = 0;}
    
    if (state1 == 0){
        b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
        b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);
        b9.setEnabled(false); b10.setEnabled(false);  t2.setEnabled(false); t3.setEnabled(false);
    } else if(state1 == 1){
    if(state2 == 0){
        b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); t2.setEnabled(true);
        b4.setEnabled(false); b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true);
        b9.setEnabled(true); b10.setEnabled(false); b11.setEnabled(true);} else{
        b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true);
        b4.setEnabled(true); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);
        b9.setEnabled(false); b10.setEnabled(true); b11.setEnabled(true); t2.setEnabled(true);
    }
    }
    
    if(e.getSource()==b1){t3.setText(String.valueOf(n1+n2));}
    if(e.getSource()==b2){t3.setText(String.valueOf(n1-n2));}
    if(e.getSource()==b3){t3.setText(String.valueOf(n1*n2));}
    if(e.getSource()==b4){if(n2 != 0){t3.setText(String.valueOf(n1/n2));}else{t3.setText("IMPOSSIVEL");t1.setText("");t2.setText("");}}
    if(e.getSource()==b5){if(n1>0){t2.setText(""); t3.setText(String.valueOf(banr.factorial((int)n1)));} else {t3.setText("Numero invalido");}}
    if(e.getSource()==b6){t3.setText(String.valueOf(banr.sin(n1))); t2.setText("");}
    if(e.getSource()==b7){t3.setText(String.valueOf(banr.cos(n1))); t2.setText("");}
    if(e.getSource()==b8){t3.setText(String.valueOf(Math.tan(n1))); t2.setText("");}
    if(e.getSource()==b9){t3.setText(String.valueOf(banr.sqrt(n1))); t2.setText("");}
    if(e.getSource()==b10){t3.setText(String.valueOf(banr.pot(n1, n2)));}
    if(e.getSource()==b11){t2.setText(""); t1.setText(""); t3.setText(""); b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
        b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);
        b9.setEnabled(false); b10.setEnabled(false);  t2.setEnabled(false); t3.setEnabled(false);}
    
    }
    
    
    
    public static void main(String...s){
    new calculator();
    }
}