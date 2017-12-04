import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Implementacao extends UnicastRemoteObject implements Interface{

	protected Implementacao() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	float temperature, ctoKelvin, ftoKelvin;
	String resp;
	
	public float toCelsius(float temp) throws RemoteException{
		temperature = temp;
		
		return temperature;
	}
	
	public float toFahrenheit(float temp) throws RemoteException {
		temperature = temp;
		
		return temperature;
	}
	
	public float difference(float c, float f) throws RemoteException {
		temperature  = c - f;
		
		return temperature;
	}
	
	public String equalizeTemp(float c, float f)throws RemoteException{
		ctoKelvin = c + 273;
		ftoKelvin = (f + 459) * 5/9;
		
		if(ctoKelvin > ftoKelvin){
			resp = "Sua temperatura precisa diminuir para ficar equilibrada com a do outro cliente";
			return resp; 
			
		}else if(ctoKelvin < ftoKelvin){
			resp = "Sua temperatura precisa aumentar para ficar equilibrada com a do outro cliente";
			return resp; 
			
		} else{
			resp = "Provavelmente vocês moram perto pois tem a mesma temperatura";
			return resp; 
		}
	}
}
