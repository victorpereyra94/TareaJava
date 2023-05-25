import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.*;

public class JTextAreafirst extends JFrame{

JTextArea textArea;

public JTextAreafirst(){
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(null);

textArea = new JTextArea();
textArea.setEditable(true);
textArea.setBounds(10,10,200,200);
add(textArea);


}

public static void main(String[] args){
       JTextAreafirst t = new JTextAreafirst();
       t.setBounds(0,0,350,350);
       t.setVisible(true);
       t.setResizable(false);
       t.setLocationRelativeTo(null);


}





}