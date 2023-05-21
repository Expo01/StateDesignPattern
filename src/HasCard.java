public class HasCard implements ATMState {

    ATMMachine atmMachine;  // stores the context

    public HasCard(ATMMachine newATMMachine){

        atmMachine = newATMMachine;

    }
// each method implemented from the interface will have an output that will be different in each of the state classes
    public void insertCard() {

        System.out.println("You can only insert one card at a time");

    }

    public void ejectCard() {

        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState()); // getter methods used such that when a user action performed
        // one state then states the new state of the context class object. in this case, we are in the HasCard state
        // which was set frmo the NoCard default state wheen the first insertCard method was called with context in the
        // noCard state. Npow in the HasCard state, user called the eject method such that the state of the context is
        // changed back to NoCard by this method. various state methods will set new states depending oon the implemetation
        // of that interface method

    }

    public void requestCash(int cashToWithdraw) {

        System.out.println("You have not entered your PIN");


    }

    public void insertPin(int pinEntered) {

        if(pinEntered == 1234){

            System.out.println("You entered the correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());

        } else {

            System.out.println("You entered the wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());

        }
    }
}