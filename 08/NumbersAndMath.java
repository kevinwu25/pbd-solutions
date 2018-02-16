public class NumbersAndMath {
    public static void main(String []args) {
        //you will be counting chickens
        System.out.println("I will now count my chickens:");
        //number of hens should be 30
        System.out.println("Hens: " + (25.0 + 30.0 / 6.0));
        //number of roosters is 98
        System.out.println("Roosters: " + (100.0 - 25.0 * 2.0 % 4.0));
        //now count the eggs!
        System.out.println("I will count the eggs:");
        //order of operations
        System.out.println(3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0);
        //check if the inequality is true
        System.out.println("Is it true that 3.0 + 10.0 < 2.0 - 7.0?");
        //without quotations, you can print out the actual math of the inequality
        System.out.println(3.0 + 10.0 < 2.0 - 7.0);
        //solve for 3 + 2 and write it first as a question
        System.out.println("What is 3.0 + 10.0? " + (3.0 + 10.0));
        //solve for 5 - 7 and write is first as a question
        System.out.println("What is 2.0 - 7.0? " + (2.0 - 7.0));
        //using 3 + 2 and 5 - 7, you can see why the inequality is false
        System.out.println("Oh, that's why it's false.");
        //do some more math problems
        System.out.println("How about some more.");
        //check if each of the following inequalities are true or false 
        System.out.println("Is it greater? " + (13.0 > -5.0));
        System.out.println("Is it greater or equal? " + (13.0 >= -5.0));
        System.out.println("Is it less or equal? " + (13.0 <= -5.0));
    }
}
