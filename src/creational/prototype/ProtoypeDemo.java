package creational.prototype;

public class ProtoypeDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating object using prototype design pattern...");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();

        //we want new object of NetworkConnection
        try {
           NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
           NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
           System.out.println(networkConnection);

           networkConnection.getDomains().remove(0);
           System.out.println(networkConnection);
           System.out.println(networkConnection2);
           System.out.println(networkConnection3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
