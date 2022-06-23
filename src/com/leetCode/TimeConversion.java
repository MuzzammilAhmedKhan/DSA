package com.leetCode;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "07:05:45PM";
        String ans = timeConversion(s);
        System.out.println(ans);
    }

    public static String timeConversion(String s) {
        // Write your code here
            String[] timeArray = s.split(":");
            int hh = Integer.parseInt(timeArray[0]);
            
            String mm = timeArray[1];
            String ss = timeArray[2].substring(0, 2);
            String amPm = timeArray[2].substring(2, timeArray[2].length());
            
            String newTime = new String();
            if(hh >= 0 && hh < 12 && amPm.equalsIgnoreCase("AM")){
                newTime = String.format("%02d", hh) + ":" + mm + ":" + ss;
            }
            if(hh >= 0 && hh < 12 && amPm.equalsIgnoreCase("PM")){
                newTime = (hh + 12) + ":" + mm + ":" + ss;
            }
            if(hh == 12 && amPm.equalsIgnoreCase("AM")){
                newTime = "00" + ":" + mm + ":" + ss;
            }
            if(hh == 12 && amPm.equalsIgnoreCase("PM")){
                newTime = hh + ":" + mm + ":" + ss;
            }
            
            return newTime;
    
        }
    
}
