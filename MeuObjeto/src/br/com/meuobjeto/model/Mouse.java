package br.com.meuobjeto.model;

public class Mouse {

	// 1. Atributos sempre privados (Encapsulamento)
	private String marca;
	private double dpi;

	// 2. O CONSTRUTOR (O Cartório)
	public Mouse(String marca, double dpi) {
		this.marca = marca;
		this.setDpi(dpi); // Usa o setter privado para validar o DPI no nascimento!
		System.out.println("Registro inicial: Um mouse " + this.marca + " nasceu com " + this.dpi + " DPI.");
	}

	// 3. Getters (Apenas leitura)
	public String getMarca() {
		return this.marca;
	}

	public double getDpi() {
		return this.dpi;
	}

	// 4. COMPORTAMENTOS PÚBLICOS (As regras de negócio / Ações)
	public void aumentarDpi(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: o valor para aumentar o DPI deve ser maior que zero.");
			return;
		}
		this.setDpi(this.dpi + valor);
	}

	public void diminuirDpi(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: o valor para diminuir o DPI deve ser maior que zero.");
			return;
		}
		this.setDpi(this.dpi - valor);
	}

	// 5. SETTER PRIVADO (A engrenagem interna de validação)
	private void setDpi(double novoDpi) {
		// Regra de negócio: o DPI deve ser positivo e dentro do limite do sensor
		if (novoDpi > 0 && novoDpi <= 26000) {
			this.dpi = novoDpi;
			System.out.println("Sucesso: o DPI agora é " + this.dpi);
		} else {
			System.out.println("Erro de Validação: o DPI informado é inválido!");
		}
	}

	// Obs: A marca do mouse é IMUTÁVEL na vida real (um Logitech não vira um ATK).
	// Portanto, a regra de negócio exige que NÃO exista um método setMarca()!
}