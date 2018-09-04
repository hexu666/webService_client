package example;


import com.example.client.HelloWorldServiceLocator;
import com.example.client.HelloWorld_PortType;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
          //--Activator service = locator.get();
          HelloWorld_PortType service = locator.getHelloWorld();
          // If authorization is required
          //((HelloWorldSoapBindingStub)service).setUsername("user3");
          //((HelloWorldSoapBindingStub)service).setPassword("pass3");
          // invoke business method
          String res=service.sayHelloWorldFrom("Tom!");
          System.out.println(res);
          //service.businessMethod();
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
