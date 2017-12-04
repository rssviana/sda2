import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Interface extends Remote {
	
	float toCelsius(float temp) throws RemoteException;
	
	float toFahrenheit(float temp) throws RemoteException;
	
	float difference(float c, float f) throws RemoteException;
	
	String equalizeTemp(float c, float f)throws RemoteException;

}
