package structural.adapter;

public class JSONSoftware implements JSONData {

    @Override
    public void readJSONData() {
        System.out.println("Understand only JSON data.");
    }
}
