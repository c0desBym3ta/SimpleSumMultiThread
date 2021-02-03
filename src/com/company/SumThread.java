package com.company;

public class SumThread extends Thread{
    private int[] data;
    private int start;
    private int n;
    private int sum;

    public SumThread(int[] data, int start, int n){
        this.data = data;
        this.start = start;
        this.n = n;
    }

    public void run(){
        int s = 0;
        for(int i = start; i < start + n; i++)
            s += data[i];
        sum = s;
    }

    public int getSum(){return sum;}
}
