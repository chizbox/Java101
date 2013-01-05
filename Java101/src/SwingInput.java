
import javax.swing.JOptionPane;

public class SwingInput {

	public static void main(String [] args){
		String message = null;
		
		message = JOptionPane.showInputDialog("Hello Welcome to Java101: Enter a Message");
		String msg = "Your Message : " + message;
		JOptionPane.showMessageDialog(null, msg);
	}
}
