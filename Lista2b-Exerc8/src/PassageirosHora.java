
public class PassageirosHora {
	
	private int[][][] vetor;
	private int qtdPassageiros = 0;
	
	public PassageirosHora() {
		vetor = new int[30][12][24];
	}
	public void adiciona(int dia,int mes,int hora){
		this.vetor[dia-1][mes-1][hora]++;
		
	}
	public int qtdPassageiros(){
		int resultado = 0;
		for(int [][] a: this.vetor){
			for(int [] b: a){
				for(int c: b){
					resultado += c;
				}
			}
		}
		return resultado;
	}
	public int quatosPassageiros(int dia, int mes)
	{
		int total =0;
		int d = dia-1;
		int m = mes-1;
		for (int i = 0; i < vetor[m][d].length; i++) {
			total += vetor[m][d][i];
		}
		return total;
	}
	public int quantosPassageitos(int mes)
	{
		int total = 0;
		for (int i = 0; i <= 30; i++) {
			total += this.quatosPassageiros(i, mes);
		}
		return total;
	}
	public int mesMenorFluxo()
	{
		int mesMenor = 1;
		int qtdMenor = this.quantosPassageitos(1);
		for (int i = 2; i <= 12; i++) {
			int qtde = this.quantosPassageitos(i);
			if (qtde < qtdMenor) {
				mesMenor = i;
				qtdMenor = qtde;
				
			}
		}
		return 0;
	}
	public int[] picoTransporte()
	{
		int diaM, mesM, horaM, qtdeM;
		diaM = mesM = horaM = qtdeM = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				for (int j2 = 0; j2 < vetor[i][j].length; j2++) {
					if (vetor[i][j][j2] > qtdeM) {
						qtdeM = vetor[i][j][j2];
						horaM = j2;
						diaM = j+1;
						mesM = j+1;
						
					}
				}
			}
		}
		int[] retorno = {diaM, mesM, horaM,qtdeM};
		return retorno;
	}
}
