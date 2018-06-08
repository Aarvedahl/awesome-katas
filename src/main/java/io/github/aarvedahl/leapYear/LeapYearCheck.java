package io.github.aarvedahl.leapYear;

public class LeapYearCheck {
    public boolean after1582(int year) {
        if(year >= 1582) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLeapYear(int year) {
        if((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else if (year % 400 == 0){
            return true;
        } else {
            return false;
        }
    }
}
