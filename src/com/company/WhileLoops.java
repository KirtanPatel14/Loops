package com.company;

public class WhileLoops {

    public static int addOdds(int n){
         int count = 1;
         int sum = 0;
         while(count<=n){
             sum+=count;
             count +=2;
         }
         return sum;
    }

    public int sumDigits(int x){
        int a = 0;
        int sum = 0;
        while (x >= 1){
            a = x%10;
            sum += a;
            x /=10;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        double s = startpop;
        int year = 0;
        while (s<=endpop){
            s*= 1.0113;
            year++;
        }
        return year;
    }

    public static void printSum(int n){
        int x = 0;
        int sum = 0;
        while(x < n){
            x++;
            System.out.print(x+" + ");
            sum += x;

        }
        System.out.print("= "+sum);
    }

    public static boolean isPerfectSquare(int n){
        int x = 0;
        int count = 1;
        int square = 0;
        while (x<=n){
                if(addOdds(n)==n){
                    return true;
                }
                else return false;
        }

    }

    public static void main(String[] args) {
        WhileLoops w = new WhileLoops();
        System.out.println("addOdds");
        System.out.println(w.addOdds(9));
        System.out.println(w.addOdds(8));
        System.out.println(w.addOdds(3));
        System.out.println("  ");
        System.out.println("sumDigits");
        System.out.println(w.sumDigits(1234));
        System.out.println(w.sumDigits(1098));
        System.out.println("   ");
        System.out.println("howManyYears");
        System.out.println(w.howManyYears(111.2,120));
        System.out.println(w.howManyYears(111.2,150));
        System.out.println("  ");
        System.out.println("printSum");
        printSum(8);
        System.out.println("  ");
        printSum(10);
        System.out.println("  ");
        printSum(12);
        System.out.println("  ");
        System.out.println("isPerfectSquare");
//        System.out.println(w.isPerfectSquare(25));
//        System.out.println(w.isPerfectSquare(36));
//        System.out.println(w.isPerfectSquare(23));
//        System.out.println(w.isPerfectSquare(22));

    }
}
