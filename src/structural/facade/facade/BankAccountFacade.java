package structural.facade.facade;

import structural.facade.complexsubsystem.AccountNumberCheck;
import structural.facade.complexsubsystem.FundsCheck;
import structural.facade.complexsubsystem.SecurityCodeCheck;
import structural.facade.complexsubsystem.WelcomeToBank;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberChecker;
    SecurityCodeCheck securityCodeChecker;
    FundsCheck fundsChecker;
    WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        accountNumberChecker = new AccountNumberCheck();
        securityCodeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if(accountNumberChecker.isAccountActive(getAccountNumber()) &&
           securityCodeChecker.isSecurityCodeCorrect(getSecurityCode()) &&
                fundsChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if(accountNumberChecker.isAccountActive(getAccountNumber()) &&
           securityCodeChecker.isSecurityCodeCorrect(getSecurityCode())) {
            fundsChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }
}
