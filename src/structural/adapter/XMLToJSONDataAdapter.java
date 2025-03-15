package structural.adapter;

public class XMLToJSONDataAdapter implements JSONData {

    XMLData xmlData;

    public XMLToJSONDataAdapter(XMLData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public void readJSONData() {
        xmlData.readXMLData();
        System.out.println("Convert here XML data to JSON data.");
    }
}
