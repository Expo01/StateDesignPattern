public class TestATMMachine {

    public static void main(String[] args){

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        System.out.println("insert card called");
        System.out.println("");

        atmMachine.ejectCard();
        System.out.println("eject card called");
        System.out.println("");

        atmMachine.insertCard();
        System.out.println("insert card called 2nd time");
        System.out.println("");

        atmMachine.insertPin(1234);
        System.out.println("insert pin called");
        System.out.println("");

        atmMachine.requestCash(2000);
        System.out.println("withdraw called, given 2000 request and initial set value of 2000, now out of money");
        System.out.println("");

        atmMachine.insertCard();
        System.out.println("insert card called whilee no money");
        System.out.println("");

        atmMachine.insertPin(1234);
        System.out.println("insert pin called while no money");
        System.out.println("");

    }
}