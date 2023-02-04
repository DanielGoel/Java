package date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //creates new scanner
    Scanner input = new Scanner(System.in);
    // create two date objecs with years, months, and days
    Date date1 = new Date(2023, 2, 2);
    Date date2 = new Date(2023, 6, 9);
    
    // print first date 
    System.out.println("enter date 1: ");
    date1.print();
    
    // print second date 
    System.out.println("enter date 2: ");
    date2.print();
    
    // calculate number of days between the two dates
    int daysBetween = date1.compare(date2);
    // Print the num of days
    System.out.println("the number of days between date1 and date2 are " + daysBetween);
    
    //uesr inputs n for numbers to add to date
    System.out.print("enter the amount of days u want to add to the first date: ");
    int n = input.nextInt();
    
    // add n days to date
    date1.addDays(n);
    
    // print the new date
    System.out.println("date 1 plus " + n + " days is ");
    date1.print();
  }
}

