import java.rmi.Remote;
import java.rmi.RemoteException;

interface Testinfo extends Remote {

    String message() throws RemoteException;

    String question1() throws RemoteException;
    
    String question2() throws RemoteException;
   
    String question3() throws RemoteException;

    String a1(String input) throws RemoteException;

    String a2(String input) throws RemoteException;

    String a3(String input) throws RemoteException;

    Integer Score() throws RemoteException;

}