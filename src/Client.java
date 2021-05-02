import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {

    /*The client must lookup what it is requesting from the server.
    * */

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        /*We need to tell the client where to look to request what it wants to implement.
        *         Naming.lookup("rmi:://localhost:5099/hello");
        *The code above takes care of that. The format is a string that tells the rmi protocol where to look and the
        * name of the service.
        *
        *
        * Type "Hello World"
        */

        Responses service = (Responses) Naming.lookup("rmi://localhost:5099/hello");

        System.out.println("Client entering data to called! ");

        Scanner scan  = new Scanner(System.in);

        String password = "Hello World";
        String userInput ="";


        while(!userInput.equals(password)){
            userInput = scan.next();
            System.out.println("Server wants you to enter correct letter!");
        }

       String response =  service.sayHello(userInput);

        System.out.println(response);
    }
}
