import java.rmi.*;
import java.rmi.server.*;

public class Testinfoimpl extends UnicastRemoteObject implements Testinfo {

    public Testinfoimpl()
            throws java.rmi.RemoteException {
        super();
    }

    int counter;

    public String message() throws RemoteException {
        counter = 0;
        System.out.println("Connected to client\n");
        return "\nWelcome to the quiz!\n\n";
    }

    public String question1() throws RemoteException {
        return "Q1: (A + B)*(A+B)\n\n "
                + "1. A*A + B*B \n "
                + "2. A*A +A*B + B*B \n "
                + "3. A*A +2*A*B + B*B \n\n"
                + "Please enter your answer and click first send button, \n"
                + "to recive seceond question: \n\n";
    }

    public String question2() throws RemoteException {
        return "Q2:  (A + B)*(A - B)\n\n "
                + "1. A*A + 2*B*B\n "
                + "2. A*A - B*B\n "
                + "3. A*A -2*A*B + B*B\n\n"
                + "Please enter your answer and click second send button, \n"
                + "to recive final question: \n\n";
    }

    public String question3() throws RemoteException {
        return "Q3:   sin(x)*sin(x) + cos(x)*cos(x)\n\n "
                + "1. 1\n "
                + "2. 2\n "
                + "3. 3\n\n"
                + "Please enter your answer and click third send button, \n"
                + "to recive your answers: \n\n";
    }

    public String a1(String input) throws RemoteException {
        String res1;
        System.out.println("Client has entered " + input + " as the answer \n");

        if (input.equals("3")) {
            res1 = "Question 1 is correct \n";
            counter++;
        } else {
            res1 = "Question 1 is incorrect \n";
        }
        return res1;
    }

    public String a2(String input) throws RemoteException {
        String res2;
        System.out.println("Client has entered " + input + " as the answer \n");

        if (input.equals("2")) {
            res2 = "Question 2 is correct \n";
            counter++;
        } else {
            res2 = "Question 2 is incorrect \n";
        }
        return res2;
    }

    public String a3(String input) throws RemoteException {
        String res3;
        System.out.println("Client has entered " + input + " as the answer \n");

        if (input.equals("1")) {
            res3 = "Question 3 is correct \n";
            counter++;
        } else {
            res3 = "Question 3 is incorrect \n";
        }
        return res3;
    }

    public Integer Score() throws RemoteException {
        return counter;
    }

}
