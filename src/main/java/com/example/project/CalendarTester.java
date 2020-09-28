package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {




        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();
        int dayofMonth = myCal.get(Calendar.DAY_OF_MONTH);
        int month = myCal.get(Calendar.MONTH);
        int year = myCal.get(Calendar.YEAR);
        int weekday = myCal.get(Calendar.DAY_OF_WEEK);
       // System.out.println(dayofMonth);
       // System.out.println(month);
        // System.out.println(year);
        // System.out.println(weekday);

        System.out.print("Current Date is: "+month+"/" );
        System.out.print( dayofMonth+"/" );
        System.out.println( year);

       myCal.add(Calendar.DAY_OF_WEEK,100);
       myCal.add(Calendar.MONTH,100);
        myCal.add(Calendar.DAY_OF_MONTH,100);



       System.out.print("day: "+Calendar.DAY_OF_WEEK+" ");
       System.out.print("Date in 100 days: "+Calendar.MONTH+"/");
       System.out.print(Calendar.DAY_OF_MONTH+"/");
       System.out.println( year);



       myCal.add(Calendar.DAY_OF_WEEK,324);
        dayofMonth = myCal.get(Calendar.DAY_OF_MONTH);
        month = myCal.get(Calendar.MONTH);
        year = myCal.get(Calendar.YEAR);
        weekday = myCal.get(Calendar.DAY_OF_WEEK);

        System.out.println("day of birthday is  "+weekday);



        myCal.add(Calendar.DAY_OF_WEEK,10000);
        myCal.add(Calendar.MONTH,10000);
        myCal.add(Calendar.DAY_OF_MONTH,10000);

        dayofMonth = myCal.get(Calendar.DAY_OF_MONTH);
        month = myCal.get(Calendar.MONTH);
        year = myCal.get(Calendar.YEAR);
        weekday = myCal.get(Calendar.DAY_OF_WEEK);

        System.out.print("day: "+weekday+" ");
        System.out.print("Date in 10000 days: "+month+"/");
        System.out.print(dayofMonth+"/");
        System.out.println( year);











        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)


    }

}