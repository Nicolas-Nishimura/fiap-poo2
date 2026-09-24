package br.com.meuobjeto.model;

public class Mouse {
	public String marca;
	public double dpi;

	// Método 1: aumenta o DPI (ex: sensibilidade)
	public void aumentarDpi(double valor) {
		// Regra de negócio: o valor do ajuste deve ser positivo
		if (valor <= 0) {
			System.out.println("Erro: o valor para aumentar o DPI deve ser maior que zero.");
			return;
		}
		this.dpi += valor;
		System.out.println("DPI aumentado. Novo DPI: " + this.dpi);
	}

	// Método 2: diminui o DPI
	public void diminuirDpi(double valor) {
		// Regra de negócio: o valor deve ser positivo
		if (valor <= 0) {
			System.out.println("Erro: o valor para diminuir o DPI deve ser maior que zero.");
			return;
		}
		// Regra de negócio: o DPI não pode ficar negativo (nem zero)
		if (this.dpi - valor <= 0) {
			System.out.println("Erro: o DPI não pode ficar zero ou negativo.");
			return;
		}
		this.dpi -= valor;
		System.out.println("DPI diminuído. Novo DPI: " + this.dpi);
	}
}