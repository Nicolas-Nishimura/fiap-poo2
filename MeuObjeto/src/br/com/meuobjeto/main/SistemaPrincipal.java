package br.com.meuobjeto.main;
import br.com.meuobjeto.model.Mouse;

public class SistemaPrincipal {
	public static void main(String[] args) {
		Mouse meuMouse = new Mouse();
		meuMouse.marca = "Logitech";
		meuMouse.dpi = 800.0;

		Mouse mouseCasa = new Mouse();
		mouseCasa.marca = "ATK";
		mouseCasa.dpi = 1600.0;

		System.out.println("--- Sistema Mouse ---");
		System.out.println("Mouse da faculdade: " + meuMouse.marca + " | DPI: " + meuMouse.dpi);
		System.out.println("Mouse de casa: " + mouseCasa.marca + " | DPI: " + mouseCasa.dpi);

		// Testando aumentarDpi
		System.out.println("\nAumentando DPI do mouse da faculdade (valor válido):");
		meuMouse.aumentarDpi(400.0);

		System.out.println("Aumentando DPI do mouse da faculdade (valor inválido):");
		meuMouse.aumentarDpi(-100.0);

		// Testando diminuirDpi
		System.out.println("\nDiminuindo DPI do mouse de casa (valor válido):");
		mouseCasa.diminuirDpi(600.0);

		System.out.println("Diminuindo DPI do mouse de casa (valor inválido - ficaria negativo):");
		mouseCasa.diminuirDpi(2000.0);
	}
}