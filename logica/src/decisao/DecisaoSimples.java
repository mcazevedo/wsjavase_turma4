package decisao;
import javax.swing.JOptionPane;

class DecisaoSimples{
	public static void main(String args[]){
		String email = JOptionPane.showInputDialog("Digite o email");
		// && => and
		// || => or
		if (email.indexOf("@")>-1 && email.length()>1){
			System.out.println("Servidor: " + email.substring(email.indexOf										("@")+1));
		}
	}
}

