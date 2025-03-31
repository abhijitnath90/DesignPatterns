package behavioural.chainofresponsibility.abstracthandler;

public abstract class AbstractLogger {

    protected AbstractLogger nextLogger;

    public AbstractLogger setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    protected abstract boolean handleLogRequest(String message);

    public void postLogRequest(String message) {
        boolean isHandled = handleLogRequest(message);
        if(!isHandled && nextLogger!=null) {
            nextLogger.postLogRequest(message);
        }
    }
}
