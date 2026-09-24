package br.com.meuobjeto.main;
import br.com.meuobjeto.model.Mouse;

public class SistemaPrincipal {
	public static void main(String[] args) {
		Mouse meuMouse = new Mouse();
		meuMouse.marca = "Logitech";
		meuMouse.dpi = 800;

		Mouse mouseCasa = new Mouse();
		mouseCasa.marca = "ATK";
		mouseCasa.dpi = 1600;

		System.out.println("Mouse da faculdade: " + meuMouse.marca + " | DPI: " + meuMouse.dpi);
		System.out.println("Mouse de casa: " + mouseCasa.marca + " | DPI: " + mouseCasa.dpi);
	}
}