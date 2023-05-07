import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JButton;
public class JTextFieldTest extends JFrame implements ActionListener{
       JTextField campo;
       JTextField campo2;
       JButton btn;
       public JTextFieldTest(){
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
               setTitle("ventana de prueba");

             campo = new JTextField();
             campo.setBounds(10,25,100,25);
             add(campo);

             campo2 = new JTextField();
             campo2.setBounds(10,25,100,25);
             add(campo2);
             

             btn = new JButton("Inscribirse");
             btn.setBounds(10,75,100,31);
             btn.addActionListener(this);
             add(btn);
                 
}

@Override
public void actionPerformed(ActionEvent e){
       String name = campo.getText();
       String apellido = campo2.getText();
     JOptionPane.showMessageDialog(null," " + name + " " + apellido);
} 
      
        public static void main(String[] args){
             JTextFieldTest jt = new JTextFieldTest();
             jt.setVisible(true);
             jt.setBounds(0,0,300,300);
             jt.setResizable(false);
             jt.setLocationRelativeTo(null);

}




}

