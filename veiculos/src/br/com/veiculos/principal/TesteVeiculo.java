package br.com.veiculos.principal;

import br.com.veiculos.modelo.Automovel;
import br.com.veiculos.modelo.Montadora;

public class TesteVeiculo {

	public static void main(String[] args) {
		//Montadora montadora = new Montadora("VW","c:","ALEM�");
		//montadora.setNome("Volkswagen");
		//montadora.setSimbolo("C:\\montadora");
		//montadora.setNacionalidade("Alem�");
		
		Automovel fusca = new Automovel(
				"HDS-1234",
				500,
				2000,
				0,
				40,
				new Montadora("VW","c:","ALEM�")
				);
		
		//fusca.setMontadora(montadora);
		
		//Teste getTotal()
		System.out.println("Custo por ano: " + fusca.getTotal());
		//Teste acelerar()/acelar(param)/desacelerar(param)
		fusca.acelerar();
		fusca.acelerar();	
		fusca.acelerar(50);
		System.out.println(fusca.getVelocidadeAtual());
		fusca.desacelerar(30);
		System.out.println(fusca.getVelocidadeAtual());
		fusca.desacelerar(200);
		System.out.println(fusca.getVelocidadeAtual());
		//Teste getDistancia(param)
		System.out.println("Percorre com um tanque:" + fusca.getDistancia(8));
		//Teste getStatus()
		System.out.println("O fusca est� em movimento?" + fusca.getStatus());
		//Teste Montadora
		System.out.println(fusca.getMontadora().getNome());
		System.out.println(fusca.getMontadora().getNacionalidade());
	}

}






