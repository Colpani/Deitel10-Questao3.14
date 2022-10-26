package questao_3_14;

public class Date {
	
	int mes;
	int dia;
	int ano;
	
	public Date (int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}
	
	public void setMes (int mes) {
		this.mes = mes;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setDia (int dia) {
		this.dia = dia;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String displayDate() {
		String stmes = Integer.toString(mes);
		String stdia = Integer.toString(dia);
		String stano = Integer.toString(ano);
		return stmes + "/" + stdia + "/" + stano; //considero a ordem mm/dd/aa
	}
	
	
}
