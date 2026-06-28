package behavioural.state.abstractstate;

import behavioural.state.context.VendingMachine;

public interface MachineState {

    void selectItem(VendingMachine context, String itemCode);
    void insertCoin(VendingMachine context, double amount);
    void dispenseItem(VendingMachine context);
}
