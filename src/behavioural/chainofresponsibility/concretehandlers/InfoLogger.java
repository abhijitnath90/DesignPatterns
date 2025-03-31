package behavioural.chainofresponsibility.concretehandlers;

import behavioural.chainofresponsibility.LoggingManager;
import behavioural.chainofresponsibility.abstracthandler.AbstractLogger;

import static behavioural.chainofresponsibility.LoggingManager.INFO;

public class InfoLogger extends AbstractLogger {

    @Override
    protected boolean handleLogRequest(String message) {
        boolean isHandled = false;
        if(LoggingManager.logLevel == INFO) {
            System.out.println("[Log level is INFO, using InfoLogger]: "+message);
            isHandled = true;
        }
        return isHandled;
    }
}
