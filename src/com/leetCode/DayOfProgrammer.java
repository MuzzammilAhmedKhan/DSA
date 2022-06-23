package com.leetCode;

public class DayOfProgrammer {
    public static void main(String[] args) {
        String ans = dayOfProgrammer(1918);
        System.out.println(ans);
    }

    public static String dayOfProgrammer(int year) {
        // Write your code here
        int date = 0;
        if (year == 1918) {
            date = 32 + 14 + 31 + 30 + 31 + 30 + 31 + 31;
            // given feb 14 32nd day of year and, 1918 not a leap year (1918 % 4 != 0)
            // =>remaining days in feb of 1918 = 28 - 14 = 14
        } else if (isLeapYear(year)) {
            date = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
        } else {
            date = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        }
        date = 256 - date;
        return String.format("%02d", date) + ".09." + year;

    }

    static boolean isLeapYear(int year) {
        if (year >= 1700 && year <= 1918) {
            if (year % 4 == 0) {
                return true;
            }
        }
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }

        return false;
    }
}
