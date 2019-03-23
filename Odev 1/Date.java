/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazilimmuhendislilab;

/**
 *
 * @author tuhanan
 */
public class Date {
    private int month,day,year;

    public Date(int day, int month, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date : " + day +"/" + month + "/" + year; 
    }
    public void displayDate(Date date){
        System.out.println(date);
    }
}
