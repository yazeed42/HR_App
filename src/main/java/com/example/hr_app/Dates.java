package com.example.hr_app;

import java.util.Date;

public class Dates {
    private String start;
   private String end;
    private int totalMonth;
    private boolean isCurrent;
    public Dates(String start, String end,boolean isCurrent) {
        this.start = start;
        this.end = end;
        this.isCurrent=isCurrent;
    }
    public Dates(String start, String end,boolean isCurrent,int totalMonth){
        this.start = start;
        this.end = end;
        this.isCurrent = isCurrent;
        this.totalMonth=totalMonth;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public int getTotalMonth() {
        return totalMonth;
    }

    public boolean isValid(String date){
        if (date.length()>1)
            System.out.println("yazeed");
        return true;
    }
}
