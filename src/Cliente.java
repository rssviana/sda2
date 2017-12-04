import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.*;


public class Cliente {
	public static void main(String[] args)throws RemoteException{
		
		int choice = 0;
		Interface rfala = null;
		
		try{
			choice = Integer.parseInt(
					JOptionPane.showInputDialog(null,"Menu:\n  " 
							+ "Digite 1 para se conectar ao Servidor 1.\n  " 
							+ "Digite 2 para se conectar ao Servidor 2.\n  " 
							+ "Digite 3 para sair.","Escolha de Servidor",JOptionPane.PLAIN_MESSAGE));
			
			System.out.println(choice);

			if (choice == 1) {
				rfala = (Interface) Naming.lookup("//192.168.0.71/rmi");
			} 

			else if (choice == 2) {
				rfala = (Interface) Naming.lookup("//localhost/rmi");

			else if (choice == 3) {
				JOptionPane.showMessageDialog(null, "Saindo da aplicação.","EXIT", JOptionPane.WARNING_MESSAGE);
				System.exit(2);
			} 

			else {
				JOptionPane.showMessageDialog(null,"Por favor, digite apenas 1 ou 2", "Opção Inválida", JOptionPane.ERROR_MESSAGE);
			}
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Por favor, entre apenas com números.","Opção Inválida", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
}
