package texto;

public class Main {
	public static void main(String[] args) {
		Texto text = new Texto(6);
		
		text.IngresarCuerpo("Hola");
		
		System.out.println(text.ContarVocales());
	}
}
