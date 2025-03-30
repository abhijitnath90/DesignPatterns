package structural.proxy;

import structural.proxy.proxy.ProxyInternet;
import structural.proxy.subject.Internet;

public class ProxyDemo {

    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet();
        //internet.connectTo("www.spankbang.com");

        internet.connectTo("www.facebook.com");
        internet.connectTo("www.youtube.com");
        internet.connectTo("www.google.com");
    }
}
