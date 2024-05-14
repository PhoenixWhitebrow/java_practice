package pw.tests.addressbook.model;

import java.text.DateFormatSymbols;

public class Date {

    public String day;
    public String month;
    public String year;

    public Date(int day, int month, int year) {
        this.day = String.valueOf(day);
        this.month = new DateFormatSymbols().getMonths()[month-1];
        this.year = String.valueOf(year);
    }

    public Date(int day, String month, int year) {
        this.day = String.valueOf(day);
        this.month = month;
        this.year = String.valueOf(year);
    }
}
