package com.kuang.pojo3;

import com.kuang.pojo2.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    public void setTarget(Object target) {
        this.target = target;
    }

    //被代理接口
    private Object target;

    public void setRent(Rent rent) {
        this.target = rent;
    }
    //生成得到代理类
    public Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理实例  返回代理结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //动态代理的本质，就是使用反射机制
        Object result = method.invoke(target, args);
        return result;
    }

}
