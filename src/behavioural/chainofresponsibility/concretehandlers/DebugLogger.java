package behavioural.chainofresponsibility.concretehandlers;

import behavioural.chainofresponsibility.LoggingManager;
import behavioural.chainofresponsibility.abstracthandler.AbstractLogger;

import static behavioural.chainofresponsibility.LoggingManager.DEBUG;

public class DebugLogger extends AbstractLogger {

    @Override
    protected boolean handleLogRequest(String message) {
        boolean isHandled = false;
        if(LoggingManager.logLevel == DEBUG) {
            System.out.println("[Log level is DEBUG, using DebugLogger]: "+message);
            isHandled = true;
        }
        return isHandled;
    }
}
