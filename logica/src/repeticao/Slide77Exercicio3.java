package repeticao;
import java.util.Scanner;

class Slide77Exercicio3{

public static void main(String args[]){
Scanner teclado = new Scanner(System.in);
int escolaridade=0;
int totalPos=0;
int totalMedio=0;
int totalSuperior=0;
do{
	System.out.println("Digite:\n<1> Medio\n<2> Superior\n<3> Pós");
	escolaridade=teclado.nextInt();
	if (escolaridade==1){
		totalMedio++;
	}else if (escolaridade==2){
		totalSuperior++;
	}else if (escolaridade==3){
		totalPos++;
	}
}while(escolaridade>0 && escolaridade<4);

if (totalMedio>totalSuperior && totalMedio>totalPos){
	System.out.println("O mais votado foi Médio");
}else if(totalSuperior>totalPos){
	System.out.println("O mais votado foi Superior");
}else{
	System.out.println("O mais votado foi Pós");
}


}

}






