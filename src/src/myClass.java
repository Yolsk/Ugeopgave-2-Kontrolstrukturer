public class myClass {

void main() {

    /*


    // opgave 1 Betingelser
    double totalPrice = 1400;
    double finalPrice;

    if (totalPrice > 1000) {
        finalPrice = totalPrice * 0.8;
        System.out.println("Discount");
    } else {
        finalPrice = totalPrice;
    }
    System.out.println(finalPrice);

    ///////////////////////////////////

    // opgave 3 Betingelser med AND

    int time = 14;

    if (time >= 5 && time <= 11) {
        System.out.println("Good Morning");
    } else if (time >= 12 && time <= 17) {
        System.out.println("Good afternoon");
    } else if (time >= 18 && time <= 21) {
        System.out.println("Good evening");
    } else {
        System.out.println("Good Night");

    }
    ////////////////////////////////////////////////////

    // opgave 6 Betingelser med OR
    int ageLimit = 15;
    int guestAge = 14;
    boolean hasParentalConsent = true;

    if (guestAge >= ageLimit || (guestAge >= 13 && hasParentalConsent)) {
        System.out.println("Can Watch!");
    } else {
        System.out.println("Can't Watch!");
    }
    //////////////////////////////////////////////


    // opgave 8 Kombinerede operatorer
    int basicPrice = 5000;
    int age = 22;
    boolean hasAccidents = false;
    int accidents = 0;
    boolean riskZone = false;
    int premiumPrice;

    if (age < 25 || age > 70 || (hasAccidents && accidents > 2) || riskZone) {
        premiumPrice = basicPrice + 2000;
        System.out.println("Gets Premium Price");
    } else {
        premiumPrice = basicPrice;
        System.out.println("Gets Standard Price");
    }

    System.out.println("Premium price: " + premiumPrice);


    ///////////////////////////////



    // opgave 10 Switch-case
    double price;
    String item = "pizza";
    int quantity = 2;

    switch (item) {
        case "burger":
            price = 89;
            break;
        case "pizza":
            price = 96;
            break;
        case "salad":
            price = 65;
            break;
        case "pasta":
            price = 79;
            break;
        case "steak":
            price = 145;
            break;
        default:
            price = 0.0;
            System.out.println("No item was found");
    }
    double total = price * quantity;
    System.out.println("Total: " + total + " kr");

    ///////////////////////////////////


    //opgave 15 While Loops
    double savings = 0;
    double deposit = 500;
    double moneyGoal = 10000;
    int months = 0;

    while (savings < moneyGoal) {
        savings += deposit;
        months++;
    }
    System.out.println("It takes " + months + " months to reach goal!");

    ///////////////////////////////////////////


    // opgave 22 For Loops
    for (int i = 1; i <= 30; i++) {
        if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Fizzbuzz");
        } else {
            System.out.println(i);

        }

    }
    ////////////////////////////////////

    // opgave 20: Savings calculator

    int monthlySavings = 1000;
    int totalSavings = 0;

    for (int i = 0; i < 12; i++) {
        totalSavings+= monthlySavings;
        System.out.println(totalSavings);

    }



    // opgave 25 For loops med array
    int[] temperatures = {18, 22, 20, 25, 19, 21, 23};
    int sum = 0;

    // Average temperature
    for (int i = 0; i < temperatures.length; i++) {
        sum += temperatures[i];
    }
    double average = sum / temperatures.length;
    System.out.println(average);

    // Hottest day and coldest day
    int hottestDay = temperatures[0];
    int coldestDay = temperatures[0];
    int daysOver20 = 0;
    for (int i = 0; i < temperatures.length; i++) {
        if (temperatures[i] > hottestDay) {
            hottestDay = temperatures[i];;
        }
        if (temperatures[i] < coldestDay) {
            coldestDay = temperatures[i];
        }
        if (temperatures[i] > 20) {
            daysOver20+= 1;
        }
    }
    System.out.println("Hottest day: " + hottestDay);
    System.out.println("Coldest day: " + coldestDay);
    System.out.println("Days over 20: " + daysOver20);

     */

    /////////////////////////

}
}
