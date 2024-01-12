package com.ohgiraffer.section01.method;

public class Calculator {

    static int first,second;

    public Calculator(int first, int second) {
        this.first=first;
        this.second=second;
    }
    public Calculator(){

    }
    public int plusTwoNum(){
        return first+second;
    }

    public int minusTwoNum(){
        return  first-second;
    }
    public int multiTwoNum(){
        return  first*second;
    }
    public int divideTwoNum(){
        return  first/second;
    }
    public int modTwoNum(){
        return first%second;
    }
    public static int maxResult(){ return first>second? first:second;}
    public static int minResult(){ return first<second? first:second;}

    public static int plusTwoNum(int first, int second){
        return first+second;
    }

    public static int minusTwoNum(int first,int second){
        return  first-second;
    }
    public static int multiTwoNum(int first,int second){
        return  first*second;
    }
    public static int divideTwoNum(int first,int second){
        return  first/second;
    }
    public static int modTwoNum(int first,int second){
        return first%second;
    }
    public static int maxResult(int first,int second){return first>second? first:second;}
    public static int minResult(int first,int second){ return first<second? first:second;}

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public void setSecond(int second) {
        this.second = second;
    }
}
