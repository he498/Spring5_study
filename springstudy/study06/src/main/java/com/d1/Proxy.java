package com.d1;

public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }
    public void  rent(){
        host.rent();
        seeHouse();
        fare();
    }
    public void seeHouse(){
        System.out.println("带你看房子");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
