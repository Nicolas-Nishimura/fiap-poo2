package br.com.meuobjeto.main;
import br.com.meuobjeto.model.Mouse;

public class SistemaPrincipal {
	public static void main(String[] args) {
		System.out.println("--- Sistema Mouse ---");

		Mouse meuMouse = new Mouse();
		meuMouse.setMarca("Logitech");
		meuMouse.setDpi(800.0);

		Mouse mouseCasa = new Mouse();
		mouseCasa.setMarca("ATK");
		mouseCasa.setDpi(1600.0);

		// Lendo os dados com os getters
		System.out.println("Mouse da faculdade: " + meuMouse.getMarca() + " | DPI: " + meuMouse.getDpi());
		System.out.println("Mouse de casa: " + mouseCasa.getMarca() + " | DPI: " + mouseCasa.getDpi());

		// Testando a regra do setter (tentando burlar o sistema)
		System.out.println("\n--- Testando a proteção ---");
		System.out.println("Tentando definir DPI negativo:");
		meuMouse.setDpi(-500.0);

		System.out.println("Tentando definir DPI absurdo:");
		meuMouse.setDpi(999999.0);

		System.out.println("DPI do mouse da faculdade continua: " + meuMouse.getDpi());

		// Tente hackear descomentando a linha abaixo:
		// meuMouse.dpi = 999999.0; // O Java vai dar erro vermelho! A proteção funcionou!
	}
}