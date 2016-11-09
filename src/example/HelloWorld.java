package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by sjchen on 11/9/16.
 */
@WebService()
public class HelloWorld {

    public void constructor() {

    }

    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
    @WebMethod
    public int getFibonacci(int i){
        if (i <= 2) {

            return 1;
        }
        else{
            int a=1;
            int b=1;
            int ans=0;
            while(i>2){
                ans=a+b;
                a=b;
                b=ans;
                i--;
            }
            return ans;
        }


    }
//  public static void main(String[] argv) {
//    Object implementor = new HelloWorld ();
//    String address = "http://localhost:9000/HelloWorld";
//    Endpoint.publish(address, implementor);
//  }
}
