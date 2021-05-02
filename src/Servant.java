import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Servant extends UnicastRemoteObject implements Responses{

    protected Servant() throws RemoteException {
    }

    @Override
    public String sayHello(String prompt) {

        if(prompt.equals("Hello World")){
            prompt = "Hey you picked h";
        }else{
            prompt = " You ain't pick h!!!";
        }
        return prompt;
    }
}
