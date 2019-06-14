/******************************************************************************
 *  Compilation:  javac Birthday.java
 *  Execution:    java Birthday days
 *  
 *  Computes the number of people (by simulation) that must enter a room
 *  until two of them share a birthday. Assumes birthdays are uniform
 *  and independent from 0 to days-1.
 *  
 *  % java Birthday 365
 *  25
 *
 *  % java Birthday 365
 *  22
 *
 ******************************************************************************/


public class Birthday { 

    public static void main(String[] args) { 
        int days = Integer.parseInt(args[0]);     // number of days
        int people = 0;                           // total number of people

        //  hasBirthday[d] = true if someone born on day d; false otherwise
        //  auto-initialized to false
        boolean[] hasBirthday = new boolean[days];

        while (true) {
            people++;
            int d = (int) (days * Math.random());    // integer between 0 and days-1
            if (hasBirthday[d]) break;               // two people with the same birthday, so break out of loop
            hasBirthday[d] = true;                   // update array
        }

        System.out.println(people);
    }
}
