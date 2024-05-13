package models;

import java.util.Objects;

public class Morador {
	public int napartamento; 
	public String nome; 
	public String modelo; 
	public String cor; 
	public String placa;
	
	@Override
	public String toString() {
		return "Morador\nNúmero do Apartamento = " + napartamento + "\nNome = " + nome + "\nModelo = " + modelo + "; Cor = " + cor+ "; Placa = " + placa;
	}
	
	@Override
	public int hashCode() {
		if(napartamento>=1000) {
			int posicao = (napartamento % 10) + 9; 
			posicao = posicao - 1; 
			return posicao;
		}else {
			int posicao = (napartamento % 10); 
			posicao = posicao - 1; 
			return posicao;
		}
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(modelo, other.modelo)
				&& napartamento == other.napartamento && Objects.equals(nome, other.nome)
				&& Objects.equals(placa, other.placa);
	} 
	
	
}
