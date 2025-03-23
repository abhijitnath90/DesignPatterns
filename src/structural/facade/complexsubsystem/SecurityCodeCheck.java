package structural.facade.complexsubsystem;

public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isSecurityCodeCorrect(int securityCodeToCheck) {
        return securityCodeToCheck == getSecurityCode();
    }
}
