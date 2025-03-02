package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable {

    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very very important data";

        domains.add("www.learncodewithdurgesh.com");
        domains.add("www.substringtechnologies.com");
        domains.add("www.lcwd.com");
        domains.add("www.google.com");

        //it will take 6 seconds
        Thread.sleep(6000);
    }

    @Override
    public String toString() {
        return this.ip+" : "+this.importantData+" : "+this.domains;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //logic for deep cloning
        NetworkConnection clonedNetworkConnection = new NetworkConnection();
        clonedNetworkConnection.setIp(this.getIp());
        clonedNetworkConnection.setImportantData(this.getImportantData());

        for(String domain: this.getDomains()) {
            clonedNetworkConnection.getDomains().add(domain);
        }
        return clonedNetworkConnection;
    }
}
