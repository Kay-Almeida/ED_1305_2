package view;

import javax.swing.JOptionPane;

import controller.CarroController;
import models.Morador;

public class Principal {
	public static void main(String[] args) throws Exception {
		
		CarroController cc = new CarroController(); 
		
		int opc = 0;
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu APartamento\n 1 - Adicionar Morador\n 2 - Consultar Morador\n 3 - Excluir Morador\n 4 - Listar Moradores\n 9 - Finalizar Programa "));
			switch(opc) {
			case 1:
				Morador morador = new Morador(); 
				morador.nome = JOptionPane.showInputDialog("Digite o nome do morador: ");
				morador.napartamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento: "));
				morador.modelo = JOptionPane.showInputDialog("Digite modelo do carro: ");
				morador.cor = JOptionPane.showInputDialog("Digite a cor do carro: ");
				morador.placa = JOptionPane.showInputDialog("Digite a placa do carro: ");
				cc.adicionarmorador(morador);
				break; 
			case 2:
				Morador morador2 = new Morador(); 
				morador2.napartamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento a ser buscado: "));
				try {
					System.out.println(cc.buscarMorador(morador2).toString());
				} catch (Exception e) {
					throw new Exception("Morador não encontrado"); 
				}
				break; 
			case 3: 
				Morador morador3 = new Morador(); 
				morador3.napartamento = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do apartamento a ser excluido: "));
				cc.removeMorador(morador3);
				break; 
			case 4:
				int andar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do andar: "));
				cc.listaPorAndar(andar);
				break; 
			case 9: JOptionPane.showMessageDialog(null, "Encerrando programa...");
				break;
				default: JOptionPane.showMessageDialog(null, "Opção Inválida!!");
			}
			
		}
	}

}
