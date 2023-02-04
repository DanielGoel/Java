package date;
import java.time.LocalDate;

public class Date {
  //vars for date class
  private int year;
  private int month;
  private int day;
  
  // Constructor
  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  
  // print date yr month day
  public void print() {
    System.out.println(this.year + "/" + this.month + "/" + this.day);
  }
  
  // add days
  public void addDays(int n) {
    LocalDate date = LocalDate.of(this.year, this.month, this.day);
    // add days to date
    date = date.plusDays(n);
    //change values to new values
    this.year = date.getYear();
    this.month = date.getMonthValue();
    this.day = date.getDayOfMonth();
  }
  
  // calcuatle the amount of days between each date
  public int compare(Date other) {
    LocalDate date1 = LocalDate.of(this.year, this.month, this.day);
    LocalDate date2 = LocalDate.of(other.year, other.month, other.day);
    //see the amount of days between date1 and start of with time duration function
    return (int) java.time.Duration.between(date1.atStartOfDay(), date2.atStartOfDay()).toDays();
  }
}
