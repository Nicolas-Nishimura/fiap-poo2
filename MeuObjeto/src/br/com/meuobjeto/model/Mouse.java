package br.com.meuobjeto.model;

public class Mouse {
	// Atributos privados: ninguém de fora mexe direto
	private String marca;
	private double dpi;

	// --- GETTERS (públicos: leitura liberada) ---
	public String getMarca() {
		return this.marca;
	}

	public double getDpi() {
		return this.dpi;
	}

	// --- SETTERS ---
	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Regra Especial: o DPI não pode ser negativo nem exagerado
	public void setDpi(double dpi) {
		if (dpi <= 0) {
			System.out.println("Erro de Segurança: o DPI deve ser maior que zero!");
			return;
		}
		if (dpi > 26000) {
			System.out.println("Erro de Segurança: DPI acima do limite permitido (26000)!");
			return;
		}
		this.dpi = dpi;
	}

	// --- MÉTODOS DE COMPORTAMENTO ---
	public void aumentarDpi(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: o valor para aumentar o DPI deve ser maior que zero.");
			return;
		}
		this.dpi += valor;
		System.out.println("DPI aumentado. Novo DPI: " + this.dpi);
	}

	public void diminuirDpi(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: o valor para diminuir o DPI deve ser maior que zero.");
			return;
		}
		if (this.dpi - valor <= 0) {
			System.out.println("Erro: o DPI não pode ficar zero ou negativo.");
			return;
		}
		this.dpi -= valor;
		System.out.println("DPI diminuído. Novo DPI: " + this.dpi);
	}
}