package int101.homework01;

import work03.MyUtil;
import work04.*;

public class Int101Homework01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();
    }
    static void work01Question(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6); 
       System.out.println("Work01:Question: b = " + b);
    }
    static void work01Answer(boolean b1, boolean b2, boolean b3, 
       boolean b4, boolean b5, boolean b6) {
       boolean b = b1 ^ (b2 | b3) && b4 || b5 & b6;
       System.out.println("Work01:Answer: b = " + b);
    }
    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {
       boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6)); 
       System.out.println("Work02:Question: b = " + b);
    }
    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {
       boolean b = (v1 << v2) < v3 != v3 > (v4 ^ v5 | v6);
       System.out.println("Work02: Question: b = " + b);
    }

   static void work03UseOfUtilityClass() {
       System.out.println(MyUtil.calculateBMI(59,164));
       System.out.println(MyUtil.average(7,2,10));
   }

   static void work04UseOfObjectClass() {

       Person personOne = new Person(10);
       Person personTwo = new Person(30);
       //Test Person toString
       System.out.println(personOne);
       System.out.println(personTwo);

       //Test setId
       personTwo.setId(20);
       System.out.println("New personTwo id: " + personTwo);

       BankAccount accountOne = new BankAccount(1, personOne);
       BankAccount accountTwo = new BankAccount(2, personTwo);
       //Test BankAccount toString
       System.out.println(accountOne);
       System.out.println(accountTwo);

       //Test getOwner
       System.out.println("Owner of accountOne: "+ accountOne.getOwner());
       System.out.println("Owner of accountTwo: "+ accountTwo.getOwner());

       //Test getBalance and deposit
       accountOne.deposit(2000);
       System.out.println("Balance of " + accountOne + ": " + accountOne.getBalance());
       accountTwo.deposit(5000);
       System.out.println("Balance of " + accountTwo + ": " + accountTwo.getBalance());

       //Test withdraw
       accountOne.withdraw(500);
       System.out.println("Remaining Balance of " + accountOne + ": " + accountOne.getBalance());
       accountOne.withdraw(3000); //Error
       System.out.println("Remaining Balance of " + accountOne + ": " + accountOne.getBalance());

       //Test transfer
       accountTwo.transfer(200, accountOne);
       System.out.println("Balance of " + accountOne + ": " + accountOne.getBalance());
       System.out.println("Balance of " + accountTwo + ": " + accountTwo.getBalance());
       accountOne.transfer(400, accountTwo);
       System.out.println("Balance of " + accountOne + ": " + accountOne.getBalance());
       System.out.println("Balance of " + accountTwo + ": " + accountTwo.getBalance());

   }
}
