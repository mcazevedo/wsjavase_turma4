package decisao;
import javax.swing.JOptionPane;
class CompararString{

public static void main(String args[]){

String formacao = JOptionPane.showInputDialog("Digite TECNOLOGO ou BACHARELADO").toUpperCase();

// if (!formacao.equals("BACHARELADO")){ => se não for igual

if (formacao.equals("BACHARELADO")){
	System.out.println("De 4 a 6 anos de duração");
}else if (formacao.equals("TECNOLOGO")){
	System.out.println("De 2 a 3 anos de duração");
}else{
	System.out.println("Digite somente BACHARELADO ou TECNOLOGO");
}



}
}