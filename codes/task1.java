
    import java.util.*;
    public class task1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100");
        int myNum = getRandomNumber(1,100);
        for(int i=0 ; i<6 ; i++){
            
            
            System.out.println("take a guess");
            int guess = sc.nextInt();
            if(guess==myNum){
                System.out.println("you guessed correctly");
                break;
            }else if(guess < myNum){
            System.out.println("Your guess is too low");
            
        } else if(guess > myNum){
            System.out.println("Your guess is too high");
        }
        if( i>=5){
            System.out.println();
            System.out.println("nope. the number I was thinking of was " + myNum + "!");
        }
        
    }
    
}
   public static int getRandomNumber(int min, int max) {
       Random random = new Random();
       return random.ints(min, max).findFirst().getAsInt();
   }

   

}
