
public class Motocicleta extends Veiculo{

	private int cilindradas;
	private int nrMotos;
	public Motocicleta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Motocicleta(String d, int a, float v, int c) {
		super(d, a, v);
		this.cilindradas = c;
		// TODO Auto-generated constructor stub
	}
	@Override
	public float getValor() {
		// TODO Auto-generated method stub
		return super.getValor();
	}
	public float getValorIPVA() {
		float teste1 = 0f;
		if (cilindradas < 150 && getAno() > 2010) {
			String a = "isento";
		}else {
			float aaa = 0.99f;
			float valorIPVA = getValor();
			float teste = valorIPVA * aaa;
			teste1 = teste;
			return teste1;
		}
		return teste1;
		
	}
	
	
	
}
