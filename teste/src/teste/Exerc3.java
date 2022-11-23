package teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public class Exerc3 {
	
	public int[] histograma(Path p) {
		int vetor[] = new int[256];
		// try with resources
		//ler a parti do arquivo
		try (FileInputStream fis = new FileInputStream(p.toFile())){
			int lido = fis.read();
			while (lido != -1) {
				vetor[lido]++;
				lido = fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vetor;
	}
}