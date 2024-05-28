    import java.awt.*;  
    import java.awt.event.*;  
    class test extends Frame{  
    TextField tf;  
    test(){  
    //create components  
    tf=new TextField();  
    tf.setBounds(60,50,170,20);  
    Button b=new Button("Limpar TUDO");  
    b.setBounds(100,120,80,30);  
    //register listener  
    Outer o=new Outer(this);  
    b.addActionListener(o);//passing outer class instance  
    //add components and set size, layout and visibility  
    add(b);add(tf);  
    setSize(600,600);  
    setLayout(null);  
    setVisible(true);  
    }  
    public static void main(String args[]){  
    new test();  
    }  
    }  