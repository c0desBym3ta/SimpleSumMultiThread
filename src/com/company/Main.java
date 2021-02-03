package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] data = new int[100];
	    for(int i = 0; i < data.length; i ++)
	        data[i] = i+1;

	    SumThread[] sumThreads = new SumThread[4];
	    int n = data.length / sumThreads.length;

	    for(int i = 0; i < sumThreads.length; i++) {
			sumThreads[i] = new SumThread(data, i * n, n);
			sumThreads[i].start();
	    }

	    int sum = 0;
	    for(SumThread st : sumThreads){
	        try{
	            st.join();
	            sum += st.getSum();
            }catch(InterruptedException e){
	            e.printStackTrace();
            }
        }

	    System.out.println("Total sum: " + sum);
    }
}
