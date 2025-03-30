package structural.proxy.realsubject;

import structural.proxy.subject.Internet;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String site) throws Exception {
        System.out.println("Connected to "+site);
    }
}
