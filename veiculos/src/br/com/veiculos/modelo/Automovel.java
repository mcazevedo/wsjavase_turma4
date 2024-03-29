package br.com.veiculos.modelo;

public class Automovel {
	private String placa;
	private float valorIPVA;
	private float valorSeguro;
	private float velocidadeAtual;
	private int capacidadeTanque;
	private Montadora montadora;
	
	public Montadora getMontadora() {
		return montadora;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	public void desacelerar(float valor) {
		float novaVelocidade = velocidadeAtual - valor;
		if (novaVelocidade<0) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual=novaVelocidade;
		}
	}
	
	public boolean getStatus() {
		if (velocidadeAtual>0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public double getDistancia(float autonomia) {
		return capacidadeTanque * autonomia;
	}
	
	public void acelerar(float valor) {
		velocidadeAtual+=valor;
	}
	
	public void acelerar() {
		velocidadeAtual+=10;
	}
	
	public float getTotal() {
		return valorIPVA + valorSeguro;
	}
	
	public Automovel() {
		super();
	}
	
	public Automovel(String placa, float valorIPVA, float valorSeguro, float velocidadeAtual, int capacidadeTanque,
			Montadora montadora) {
		super();
		this.placa = placa;
		this.valorIPVA = valorIPVA;
		this.valorSeguro = valorSeguro;
		this.velocidadeAtual = velocidadeAtual;
		this.capacidadeTanque = capacidadeTanque;
		this.montadora = montadora;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public float getValorIPVA() {
		return valorIPVA;
	}
	public void setValorIPVA(float valorIPVA) {
		this.valorIPVA = valorIPVA;
	}
	public float getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(float valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

}
