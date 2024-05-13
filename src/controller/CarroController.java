package controller;

import model.Lista;
import models.Morador;

public class CarroController {
	
	Lista[] tabelaHashapartamento; 
	
	public CarroController () {
		tabelaHashapartamento = new Lista[10]; 
		inicializarTabelaHash(); 
	}
	
	private void inicializarTabelaHash() {
		int tamanho = tabelaHashapartamento.length; 
		for(int i = 0; i < tamanho; i++) {
			tabelaHashapartamento[i] = new Lista(); 
		}
	}
	
	public void adicionarmorador(Morador morador) {
		int posicao = morador.hashCode(); 
		tabelaHashapartamento[posicao].addFirst(morador);
	}
	
	public Morador buscarMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode(); 
		int tamanho = tabelaHashapartamento[posicao].size(); 
		for(int i = 0; i<tamanho; i++){
			Morador p = (Morador) tabelaHashapartamento[posicao].get(i); 
			if(p.napartamento == morador.napartamento) {
				morador = p; 
				break; 
			}
		}
		return morador; 
	}
	
	public void removeMorador(Morador morador) throws Exception {
		int posicao = morador.hashCode(); 
		int tamanho = tabelaHashapartamento[posicao].size(); 
		for(int i = 0; i<tamanho; i++) {
			Morador p = (Morador) tabelaHashapartamento[posicao].get(i);
			if(p.napartamento == (morador.napartamento)) {
				System.out.println("Removendo "+ p.toString()+ " do sistema");
				tabelaHashapartamento[posicao].remove(i);
				break; 
			}
		}
		
	}
	
	public void listaPorAndar(int andar) throws Exception {
		int posicao = andar - 1; 
		int tamanho = tabelaHashapartamento[posicao].size(); 
		for(int i = 0; i<tamanho; i++) {
			Morador p = (Morador) tabelaHashapartamento[posicao].get(i);		
			System.out.println(p.toString());
		}
	}
	
	
	
}
