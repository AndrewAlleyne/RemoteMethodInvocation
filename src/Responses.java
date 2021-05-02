
/*
* We need the interface to extend the remote object as it will be used to
* generate a stub file.
* */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Responses extends Remote {

    /*We now need to describe the methods that we are going to invoke from the client side.
    * say */

    String greeting = "";

    public String sayHello(String greeting)throws RemoteException;

}
