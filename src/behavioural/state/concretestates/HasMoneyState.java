package behavioural.state.concretestates;

import behavioural.state.abstractstate.MachineState;
import behavioural.state.context.VendingMachine;

public class HasMoneyState implements MachineState {


    @Override
    public void selectItem(VendingMachine context, String itemCode) {
        System.out.println("Cannot change item after inserting money.");
    }

    @Override
    public void insertCoin(VendingMachine context, double amount) {
        System.out.println("Money already inserted.");
    }

    @Override
    public void dispenseItem(VendingMachine context) {
        System.out.println("Dispensing item: " + context.getSelectedItem());
        context.setState(new DispensingState());
        System.out.println("Item dispensed successfully.");
        context.reset();
    }
}
