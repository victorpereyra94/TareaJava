import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JButton;
public class JTextFieldFourButtons extends JFrame implements ActionListener{

 JTextField campo;
       JTextField campo2;
       JButton btn;
       JButton btn2;
       JButton btn3;
       JButton btn4;
       public JTextFieldFourButtons(){
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
               setTitle("ventana de prueba");

             campo = new JTextField();
             campo.setBounds(10,25,100,25);
             add(campo);

             campo2 = new JTextField();
             campo2.setBounds(10,25,100,25);
             add(campo2);
             

             btn = new JButton("Boton 1");
             btn.setBounds(10,75,100,31);
             btn.addActionListener(this);
             add(btn);

             btn2 = new JButton("Boton 2");
             btn2.setBounds(10,115,100,31);
             btn2.addActionListener(this);
             add(btn2);

             btn3 = new JButton("Boton 3");
             btn3.setBounds(10,151,100,31);
             btn3.addActionListener(this);
             add(btn3);

             btn4 = new JButton("Boton 4");
             btn4.setBounds(10,186,100,31);
             btn4.addActionListener(this);
             add(btn4);
                 
}

@Override
public void actionPerformed(ActionEvent e){
       String name = campo.getText();
       String apellido = campo2.getText();
     if(e.getSource() == btn){
    JOptionPane.showMessageDialog(null,"Presiono boton 1 ->" + " " + name + " " + apellido);
}
   
     if(e.getSource() == btn2){
    JOptionPane.showMessageDialog(null,"Presiono boton 2 ->" + " " + name + " " + apellido);
}

     if(e.getSource() == btn3){
    JOptionPane.showMessageDialog(null,"Presiono boton 3 ->" + " " + name + " " + apellido);
}

     if(e.getSource() == btn4){
    JOptionPane.showMessageDialog(null,"Presiono boton 4 ->" + " " + name + " " + apellido);
}

} 
      
        public static void main(String[] args){
        JTextFieldFourButtons jt = new JTextFieldFourButtons();
             jt.setVisible(true);
             jt.setBounds(0,0,300,300);
             jt.setResizable(false);
             jt.setLocationRelativeTo(null);

}

}
       
             