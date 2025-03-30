package structural.proxy.proxy;

import structural.proxy.realsubject.RealInternet;
import structural.proxy.subject.Internet;

import java.util.HashSet;
import java.util.Set;

public class ProxyInternet implements Internet {

    RealInternet realInternet;

    private static final Set<String> bannedSites = Set.of("www.xvideos.com",
            "www.pornhub.com",
            "www.spankbang.com",
            "www.aznude.com",
            "www.xhamster.com");


    private boolean isBannedSite(String site) {
        return bannedSites.contains(site);
    }

    @Override
    public void connectTo(String site) throws Exception {
        if(!isBannedSite(site)) {
            realInternet = new RealInternet();
            realInternet.connectTo(site);
        } else {
            throw new Exception(site+" is banned");
        }
    }

}
