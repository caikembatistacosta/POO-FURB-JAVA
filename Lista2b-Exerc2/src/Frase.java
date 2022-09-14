public class Frase {
	private String texto;

	public Frase(String texto) {
		this.texto = texto;
	}
	public String[] decompor() {
		
		String[] textoSeparado = this.texto.split(" ");
		return textoSeparado;
	}
	
}
