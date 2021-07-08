import java.util.Random;
import java.util.Scanner;

class Rolling_two_dice{

    public static void main(String arg[]){
        Random dicenum = new Random();
        int resultdice=0;
        int totalValue=0;
        //名前パート
        Scanner inputname = new Scanner(System.in);
        System.out.println("What is your name");
        String name = inputname.next();
        System.out.println("Hello, "+name+"!");
        //サイコロパート
        System.out.println("Rolling the dice...");
        for(int i = 1; i < 3; i++){
            resultdice = dicenum.nextInt(6);
            resultdice = resultdice+1;
            System.out.println("Die "+ i +" : " + resultdice);
            totalValue +=resultdice;
        }
        System.out.println("Total value : "+totalValue);
        //判定
        
        if(totalValue > 7){System.out.println(name+" won!");}
        else{System.out.println(name+" lost.");}

    }
}
