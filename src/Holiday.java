//import java.util.Objects;

/*
The Java class called Holiday is started below. An object of class Holiday represents a holiday
during the year. This class has three instance variables:
name, which is a String representing the name of the holiday
day, which is an int representing the day of the month of the holiday
month, which is a String representing the month the holiday is in

public class Holiday {
private String name;
private int day;
private String month;
// your code goes here
}

Write a constructor for the class Holiday, which takes a String representing the name, an int representing
the day, and a String representing the month as its arguments, and sets the class variables to these
values.

Write a method inSameMonth, which compares two instances of the class Holiday, and returns the Boolean
value true if they have the same month, and false if they do not.

Write a method avgDate which takes an array of base type Holiday as its argument, and returns a double that
is the average of the day variables in the Holiday instances in the array. You may assume that the array
is full (i.e. does not have any null entries).

Write a piece of code that creates a Holiday instance with the name “Independence Day”, with the day “4”,
and with the month “July”.
 */
public class Holiday {
    private String name;
    private int day;
    private String month;

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static Boolean inSameMonth(Holiday holiday, Holiday holiday1) {
        if (holiday1.getMonth() == (holiday.getMonth())) {
            return true;
        } else {
            return false;
        }

    }

    public static double avgDate(Holiday[] holiday)
    {
        int sum=0;
        for (Holiday h : holiday)
        {
            sum += h.getDay();
        }

        return (sum/(holiday.length));
    }


    public static void main(String[] args){
        Holiday[] holiday = new Holiday[2];
        Holiday H = new Holiday("Independence Day", 1, "july");
        Holiday Holi = new Holiday("Holiday", 4, "march");
        holiday[0] = H;
        holiday[1] = Holi;
        System.out.println(inSameMonth(H, Holi));
        System.out.println(avgDate(holiday));

    }

}
