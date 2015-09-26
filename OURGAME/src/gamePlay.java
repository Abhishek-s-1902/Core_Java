
import java.rmi.Remote;
import java.rmi.RemoteException;

// @author  Abhishek Sharma
public interface gamePlay extends Remote{
	
	
	public void updateData(String S) throws java.rmi.RemoteException;
	public void setMessage(String S) throws RemoteException;
	public void updateDataPlayer1(String S)throws java.rmi.RemoteException;
	public void updateDataPlayer2(String S)throws java.rmi.RemoteException;
	public void setfinalWinner(String winner)throws java.rmi.RemoteException;
	
}
