import java.awt.EventQueue;

public class App {
	public static void main(String[] args) {
		VetorDeReais vetor = new VetorDeReais(3);
		vetor.setValor(2, 0);
		vetor.setValor(4, 1);
		vetor.setValor(6, 2);
		VetorDeReais vetor2 = new VetorDeReais(3);
		vetor2.setValor(1, 0);
		vetor2.setValor(2, 1);
		vetor2.setValor(3, 2);


		vetor.maiorDiferenca();
	}
}
