import java.util.ArrayList;

public class Detran {
	private String uf;
	private ArrayList<Veiculo> veiculo = new ArrayList<>();
	
	
	public String listaVeiculos() {
		return veiculo.toString();
	}
	
	
	public float addVeiculo(Veiculo v) {
		if (v != null) {
			veiculo.add(v);
			return v.getValorIPVA();
		} else
			throw new IllegalArgumentException("Veiculo não pode ser nulo");
	}
	public ArrayList<Veiculo> quaisVeiculosFaixa(float limInf, float limSup)
	{
		Veiculo veiculo1 = new Veiculo();
		if (veiculo1.getValorIPVA() >= limInf && veiculo1.getValorIPVA() <= limSup) {
			return veiculo;
		}
		return veiculo;		
	}
	public String toString() {
		Veiculo veiculo  = new Veiculo();
		Automovel automovel = new Automovel();
		String str = "";

			str = "Detran de Santa Catarina: " + veiculo.getDescricao()+","+veiculo.getAno()+","+"no valor de r$"+veiculo.getValor()+","+veiculo.getValorIPVA();
			return str;
	}

}
