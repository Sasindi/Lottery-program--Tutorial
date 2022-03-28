package com.company;

public class Main {

    public static void main(String[] args) {
        int min = 1;
        int max = 49;

        int[] lottery = new int[5];
        int count =0;
        int num=0;
        int newCount=0;

        //Create a random number and add it to the array
        num= (int)Math.floor(Math.random()*(max-min+1)+min);
        lottery[count]=num;
        count++;


        while(count<=4) {

            //stop repeat the same number
            while (newCount < 5) {
                if (lottery[newCount] != num) {
                    lottery[count] = num;
                    count++;
                    newCount++;
                } else {
                    break;
                }

            }
            //create new random number
            num = (int) Math.floor(Math.random() * (max - min + 1) + min);

        }


        //print lottery numbers
        System.out.println("Lottery numbers are : ");
        count=0;
        while(count<5){
            System.out.println(lottery[count]);
            count++;
        }

    }
}


//hashset
//don't use shuffle