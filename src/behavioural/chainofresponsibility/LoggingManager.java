package behavioural.chainofresponsibility;

import behavioural.chainofresponsibility.abstracthandler.AbstractLogger;
import behavioural.chainofresponsibility.concretehandlers.DebugLogger;
import behavioural.chainofresponsibility.concretehandlers.ErrorLogger;
import behavioural.chainofresponsibility.concretehandlers.InfoLogger;

public class LoggingManager {

    public static int DEBUG = 0;
    public static int INFO = 1;
    public static int ERROR = 2;
    public static int logLevel = DEBUG;

    public static AbstractLogger errorLogger;
    public static AbstractLogger infoLogger;
    public static AbstractLogger debugLogger;

    public static void setup(int logLevel) {
        LoggingManager.logLevel = logLevel;
        errorLogger = new ErrorLogger();
        infoLogger = new InfoLogger();
        debugLogger = new DebugLogger();
        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);
    }

    public static void error(String logMessage) {
        errorLogger.postLogRequest(logMessage);
    }

    public static void info(String logMessage) {
        infoLogger.postLogRequest(logMessage);
    }

    public static void debug(String logMessage) {
        debugLogger.postLogRequest(logMessage);
    }

}
