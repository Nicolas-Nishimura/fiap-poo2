package br.com.meuobjeto.main;
import br.com.meuobjeto.model.Mouse;

public class SistemaPrincipal {
	public static void main(String[] args) {

		System.out.println("--- Sistema Mouse ---\n");

		// TESTE 1: A forma correta (Nascimento legalizado)
		Mouse meuMouse = new Mouse("Logitech", 800.0);
		Mouse mouseCasa = new Mouse("ATK", 1600.0);

		System.out.println("\n--- Status dos Mouses ---");
		System.out.println("Mouse da faculdade: " + meuMouse.getMarca() + " | DPI: " + meuMouse.getDpi());
		System.out.println("Mouse de casa: " + mouseCasa.getMarca() + " | DPI: " + mouseCasa.getDpi());

		System.out.println("\n--- Ajustando a sensibilidade ---");
		meuMouse.aumentarDpi(400.0);
		mouseCasa.diminuirDpi(600.0);

		System.out.println("\n--- Testando a proteção ---");
		meuMouse.aumentarDpi(-100.0);      // valor inválido
		meuMouse.aumentarDpi(999999.0);    // estouraria o limite do sensor
		System.out.println("DPI do mouse da faculdade continua: " + meuMouse.getDpi());

		// TESTE 2: Tentando burlar o sistema (Descomente a linha abaixo)
		// Mouse mouseFantasma = new Mouse();
		// ERRO DE COMPILAÇÃO! "The constructor Mouse() is undefined".
		// Assim que você cria um construtor com regras, o Java DESTRÓI o construtor vazio padrão.
	}
}