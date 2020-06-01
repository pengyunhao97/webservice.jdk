package service;

import javax.xml.ws.Endpoint;

/**
 * 发布服务
 * @author Administrator
 */
public class Publish {
    public static void main(String[] args) {
        //发布服务的地址，JDK不能直接访问地址 需要在地址后面加上：?wsdl 用来描述服务
        String address = "http://localhost:8889/helo";
        //发布服务
        SayHello implementor = new SayHello();
        //异步执行
        Endpoint.publish(address, implementor);
        System.out.println("服务发布成功");
    }
}
