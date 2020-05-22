package com.kuang.pojo2;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy();// 这里的proxy 是 自动生成的
        proxy.rent();
    }
}
