package com.company;

public class WhileLoops {

    public int addOdds(int n){
         int count = 1;
         int sum = 0;
         while(count<=n){
             sum+=count;
             count +=2;
             System.out.println(sum+" "+count);
         }
         return sum;
    }

    public int sumDigits(int n){

    }

    public static void main(String[] args) {
        WhileLoops w = new WhileLoops();
        System.out.println(w.addOdds(9));
    }
}
