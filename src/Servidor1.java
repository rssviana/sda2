import java.rmi.Naming;

public class Servidor1 {
	public static void main (String [] args){
		
		try{
			Implementacao convert = new Implementacao(); 
			Naming.rebind("//localhost/rmi", convert); 
			System.out.println("Servidor Online");
		}
		catch (Exception e){
			System.err.println("Ops! Algo de errado não está certo : " + e);
			e.printStackTrace();
			System.exit(2);
		}
		System.out.println("Loading... .. .");
	}
}
