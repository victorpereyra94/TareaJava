import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class JTextAreasample extends JFrame{

JTextArea textArea;
JScrollPane scrollPane;

public JTextAreasample(){
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLayout(null);

textArea = new JTextArea();
textArea.setLineWrap(true);

scrollPane = new JScrollPane(textArea);
scrollPane.setBounds(10,10,200,200);
add(scrollPane);


}

public static void main(String[] args){
       JTextAreasample frame = new JTextAreasample();
       frame.setSize(450,450);
       frame.setVisible(true);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);


}





}