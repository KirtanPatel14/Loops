package com.company;

public class Factorials {

    public static int calcFactorial(int n){
        int total = 1;
        for(int x = n; x>0; x--){
            total = x*total;
        }
        return total;
    }

    public static void main(String[] args) {
        for (int x =1; x<=10; x++){
            System.out.println(calcFactorial(x));
        }
    }
}
