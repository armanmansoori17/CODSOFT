import java.util.Scanner;
public class Number_Game {
    public static void main(String args[]){
        double random = Math.floor(Math.random()*10)+1;
        int Count=10;
        System.out.println("no of attempts you have : 3");
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=3;i++){
            Count--;
            System.out.println("Guess the number: ");
            Double num=scanner.nextDouble();
            if(num<random){
                System.out.println("Guess a larger number");
            }
            else if(num>random){
                System.out.println("Guess a smaller  number");
            }
            else{
                System.out.println("Congratulations You won !!!");
                System.out.println("Score = "+Count*2+"/20");
                break;
            }
            if(i==10){
                System.out.println("End of Attempts!!!");
                System.out.println("actual number : "+random);
                break;
            }
        }
        scanner.close();
    }
}