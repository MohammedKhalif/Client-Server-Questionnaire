
import java.rmi.*;

public class TestServer {

    public TestServer() {
        try {
            System.setProperty("java.security.policy", "java.policy");
            System.setSecurityManager(new RMISecurityManager());

            Testinfoimpl ansrServer = new Testinfoimpl();
            Naming.rebind("server", ansrServer);
            System.out.println("Waiting for client...");
        } catch (Exception e) {
            System.out.println("\n Not connected to server ");
        }
    }

    public static void main(String args[]) {
        new TestServer();
    }

}
