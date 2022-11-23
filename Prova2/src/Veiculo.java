import java.sql.Date;

public  class Veiculo {
	private String descricao;
	private int ano;
	private float valor;
	private String codigo;
	
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public Veiculo(String d, int a, float v) {
		super();
		this.descricao = d;
		this.ano = a;
		this.valor = v;
	}
	public float getValor() {
		return valor;
	}

	public void setAno(int ano) {
        Date dt = new Date(ano);
        int year = dt.getYear();
		if(ano < 1900 && ano > year) {
			this.ano = ano;
		}else {
			throw new IllegalArgumentException("Veiculo com ano n valido");
		}
		
	}
	public int getAno() {
		return ano;
	}
	public float getValorIPVA() {
		return getValorIPVA();
	}
	public String getDescricao() {
		return descricao;
	}
	
}
