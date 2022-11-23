
public class Automovel extends Veiculo{

	private boolean importado;
	private int nrCarros;
	
	public Automovel() {
		// TODO Auto-generated constructor stub
	}

	public Automovel(String d, int a, float v, boolean i) {
		super(d, a, v);
		this.importado = i;
	}
	@Override
	public float getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}
	public float getValorIPVA() {
		float teste1 = 0f;
		if (importado == true) {
			double aaa = 0.98f;
			float valorIPVA = getValor();
			float teste = valorIPVA * (float)aaa;
			teste1 = teste;
		}
		if (getAno() <= 2010) {
			String teste11 = "isento";
		}
		if (importado == false && getAno() > 2010) {
			double aaa = 0.99;
			float valorIPVA = getValor();
			float teste = valorIPVA * (float)aaa;
			teste1 = teste;
		}
		return teste1;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}
	

	
	
}
