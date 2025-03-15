package structural.adapter;

public class XMLSoftware implements XMLData {

    @Override
    public void readXMLData() {
        System.out.println("Understands only XML data.");
    }
}
