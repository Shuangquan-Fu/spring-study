package com.kuang.pojo;

public class Proxy implements Rent {
    private Host host;
    public  Proxy(){

    }
    public Proxy(Host host){

    }

    public void rent() {
        seeHouse();
        host.rent();
        fare();

    }

    //看房子
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
