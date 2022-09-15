
public class Contribuinte {
 private String nome;
 private String CPF;
 private String UF;
 private double rendaAnual;
 
 
public Contribuinte(String nome, String cPF, String uF, double rendaAnual) {
	super();
	setNome(nome);
	setCPF(cPF); 
	setUF(uF);
	setRendaAnual(rendaAnual);
}

public Contribuinte() {
	super();
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCPF() {
	return CPF;
}
public void setCPF(String cPF) {
	CPF = cPF;
}
public String getUF() {
	return UF;
}
public void setUF(String uF) {
	uF = uF.toUpperCase();
	if (uF.equals("RS") || uF.equals("SC") || uF.equals("PR")) {
		this.UF = uF;
	}
}
public double getRendaAnual() {
	return rendaAnual;
}
public void setRendaAnual(double rendaAnual) {
	if (rendaAnual >= 0) {
		this.rendaAnual = rendaAnual;
	}
}
public double getImposto()
{

    return this.rendaAnual * this.getAliquota();
}
public double getAliquota()
{
	double aliquota = 0;
	if (this.rendaAnual > 35000) 
	{	
		aliquota = 0.3;
	}
	else if (this.rendaAnual >= 25001)
	{
		aliquota = 0.275;
	}else if (this.rendaAnual >= 9001) 
	{
		aliquota = 0.15;
	}else if (this.rendaAnual >= 4001)
	{
		aliquota = 0.058;
	}
	return aliquota;
}
 
}
