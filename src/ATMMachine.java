public class ATMMachine {

    // reference to all ATM states stored here
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState; // interface object, empty here but will store state

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    //new state objects created when the ATM machine created
    public ATMMachine(){ //constructor

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard; // default state set

        if(cashInMachine <= 0){

            atmState = atmOutOfMoney; // state changed to out of money if money gone

        }

    }
//
    void setATMState(ATMState newATMState){

        atmState = newATMState;

    } // creates interface object and sets the state

    public void setCashInMachine(int newCashInMachine){

        cashInMachine = newCashInMachine;

    } // allows for resetting of ATM balance which would be bad
    // for user to be able to do but lets not worry about that now

    //below 4 methods all call the instance method from the state class on whichever state the interface object is currently in

    public void insertCard() {

        atmState.insertCard();

    }

    public void ejectCard() {

        atmState.ejectCard();

    }

    public void requestCash(int cashToWithdraw) {

        atmState.requestCash(cashToWithdraw);

    }

    public void insertPin(int pinEntered){

        atmState.insertPin(pinEntered);

    }


    // there are just getters that return the state
    public ATMState getYesCardState() { return hasCard; }
    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasPin() { return hasCorrectPin; }
    public ATMState getNoCashState() { return atmOutOfMoney; }

}