public interface ATMState {

    // Different states expected
    // HasCard, NoCard, HasPin, NoCash
    // each method will go into each of the states for how that state will respond to the same method call from the
    // interface. these methods should all make sense from the perspective of the different states
    //

    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}