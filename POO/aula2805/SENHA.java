import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SENHA extends JFrame implements ActionListener
 {
   JLabel L1,L2;
   JTextField T1;
   JPasswordField P1;   

 public static void main(String args[])
  {
   JFrame Janela=new SENHA();
   Janela.show();
  }

  SENHA()
   {
    setTitle("Verifica Senha");
    setBounds(200,300,350,65);
    getContentPane().setBackground(new Color(150,150,150));
    getContentPane().setLayout(new GridLayout(2,2));
    L1 = new JLabel("Digite a SENHA:");  
    L2 = new JLabel("Validacao:");
    L1.setForeground(Color.black);
    L2.setForeground(Color.black);
    L1.setFont(new Font("",Font.BOLD,14));
    L2.setFont(new Font("",Font.BOLD,14));
    T1 = new JTextField();
    T1.setForeground(Color.red);
    P1 = new JPasswordField();   
    P1.setEchoChar('*');   
    P1.addActionListener(this); //registra o P1
    getContentPane().add(L1);
    getContentPane().add(P1);
    getContentPane().add(L2);
    getContentPane().add(T1);
   }

  public void actionPerformed(ActionEvent e)
   {  
    if (P1.getText().equals("JAVA")){
     T1.setText("Senha Valida");
     Path privado = Path.of("C:/Users/aluno.IFFALUNOS/Desktop/aula2805/file.txt");
     String content = Files.readString(filePath);
     System.exit(0);}
    else    
     T1.setText("Senha Invalida");  
   }
}
