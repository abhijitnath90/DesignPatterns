package behavioural.chainofresponsibility;

import static behavioural.chainofresponsibility.LoggingManager.*;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {

        LoggingManager.setup(DEBUG);
        //LoggingManager.setup(INFO);
        //LoggingManager.setup(ERROR);

        LoggingManager.error("...logging an error....");
        LoggingManager.debug("...logging a debug statement...");
        LoggingManager.info("...logging an info...");

    }
}
