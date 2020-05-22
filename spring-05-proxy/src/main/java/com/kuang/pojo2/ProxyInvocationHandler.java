package com.kuang.pojo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }
    //生成得到代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //处理实例  返回代理结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //动态代理的本质，就是使用反射机制
        Object result = method.invoke(rent, args);
        return result;
    }
    public void seeHouse(){
        System.out.println("中介看房子");
    }
}
