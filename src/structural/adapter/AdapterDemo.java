package structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        XMLSoftware xmlSoftware = new XMLSoftware();
        JSONData xmlAdapter = new XMLToJSONDataAdapter(xmlSoftware);
        xmlAdapter.readJSONData();
    }
}
