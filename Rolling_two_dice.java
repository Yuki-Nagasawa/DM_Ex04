import java.util.Random;

class Rolling_two_dice{

    public static void main(String arg[]){
        Random dicenum = new Random();
        int resultdice=0;
        int totalValue=0;
        System.out.println("Rolling the dice...");
        for(int i = 1; i < 3; i++){
            resultdice = dicenum.nextInt(6);
            resultdice = resultdice+1;
            System.out.println("Die "+ i +" : " + resultdice);
            totalValue +=resultdice;
        }
        System.out.println("Total value : "+totalValue);

    }
}
