import java.util.Scanner;

public class BMI {
    public static void main(String[]args){

    int age, lfstyl;
    String name;
    double bmr = 0, nbmr = 0, pounds, height;
    char gender;

    Scanner scan = new Scanner(System.in);

    System.out.println("ENTER YOUR NAME: ");
    name = scan.nextLine();
    System.out.println("ENTER YOUR AGE: ");
    age = scan.nextInt();
    System.out.println("ENTER YOUR WEIGHT (Pounds): ");
    pounds = scan.nextDouble();
    System.out.println("ENTER YOUR HEIGHT (Inches): ");
    height = scan.nextDouble();
    System.out.println("ENTER YOUR GENDER: (m or f)");
    gender = scan.next().charAt(0);

    if (gender == 'F' || gender == 'f'){
        bmr = 660 + (4.3 * pounds) + (4.7 * height) - (4.7 * age);
        System.out.println("BMR is: " + bmr);
    }
    else if (gender == 'M' || gender == 'm'){
        bmr = 665 + (6.3 * pounds) + (12.9 * height) - (6.8 * age);
        System.out.println("BMR is: " + bmr);
    }

    System.out.println("ENTER YOUR LIFESTYLE");
    System.out.println("");
    System.out.println("1. SEDENTARY (SOMEWHAT INACTIVE)");
    System.out.println("2. SOMEWHAT ACTIVE (EXERCISE OCCATIONALLY)");
    System.out.println("3. ACTIVE (EXERCISE 3-4 DAYS A WEEK)");
    System.out.println("4. HIGHLY ACTIVE (EXECISE EVERYDAY)");
    System.out.println("");
    System.out.println("ENTER YOUR LIFESTYLE: ");
    lfstyl = scan.nextInt();

    switch(lfstyl){

        case 1:
        nbmr = bmr + 0.2;
        break;
        case 2:
        nbmr = bmr + 0.3;
        break;
        case 3:
        nbmr = bmr + 0.4;
        break;
        case 4:
        nbmr = bmr + 0.5;
        break;
    }

    System.out.println("Your new BMR is: " + nbmr);

    }
}
