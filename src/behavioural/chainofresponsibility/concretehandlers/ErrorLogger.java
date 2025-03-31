package behavioural.chainofresponsibility.concretehandlers;

import behavioural.chainofresponsibility.LoggingManager;
import behavioural.chainofresponsibility.abstracthandler.AbstractLogger;

import static behavioural.chainofresponsibility.LoggingManager.ERROR;

public class ErrorLogger extends AbstractLogger {

    @Override
    protected boolean handleLogRequest(String message) {
        boolean isHandled = false;
        if(LoggingManager.logLevel == ERROR) {
            System.out.println("[Log level is ERROR, using ErrorLogger]: "+message);
            isHandled = true;
        }
        return isHandled;
    }
}
