package decisao;

import javax.swing.JOptionPane;
class CompararChar{

public static void main(String args[]){

char formacao = 
JOptionPane.showInputDialog("Digite <T> - TECNOLOGO ou <B> - BACHARELADO").toUpperCase().charAt(0);


if (formacao == 'B'){
	System.out.println("De 4 a 6 anos de duração");
}else if (formacao=='T'){
	System.out.println("De 2 a 3 anos de duração");
}else{
	System.out.println("Digite somente B ou T");
}



}
}