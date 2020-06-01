package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService//标记为远程服务
public class SayHello {
    @WebMethod//标记为远程服务的方法
    public String sayHello(String name){
        return name+"  Hello !";
    }
}
