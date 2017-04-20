package com.theironyard.novauc.entities;

/**
 * Created by jerieshasmith on 4/11/17.
 */
public class Innings {

    private int number;
    private String top;
    private int outs;
    private int totalOuts;
    private boolean isEven;


    public Innings() {

    }

    public Innings(int number, String top, int outs, int totalOuts) {
        this.number = number;
        this.top = top;
        this.outs = outs;
        this.totalOuts = totalOuts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public int getOuts() {
        return outs;
    }

    public void setOuts(int outs) {
        this.outs = outs;
    }

    public int getTotalOuts() {
        return totalOuts;
    }

    public void setTotalOuts(int totalOuts) {
        this.totalOuts = totalOuts;
    }

    public boolean isEven() {
        return isEven;
    }

    public void setEven(boolean even) {
        isEven = even;
    }
}