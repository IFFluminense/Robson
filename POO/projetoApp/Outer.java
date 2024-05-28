    import java.awt.event.*;  
    class Outer implements ActionListener{  
    test obj;  
    Outer(test obj){  
    this.obj=obj;  
    }  
    public void actionPerformed(ActionEvent e){  
    obj.tf.setText("");  
    }  
    }  