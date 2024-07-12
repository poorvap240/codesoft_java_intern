import java.util.*;
class task4
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String userAns;
            char choice;
            String ques[] = {"In which year India won its first World Cup ?" ,
                "Which planet in solar system is known as Red Planet?" ,
                "Which is the longest River in the World?" ,
                "What chemical element is designated as Hg?" ,
                "Hitler's party is known as :" };
            
            String opt[] = {"A) 1983 B) 1991 C) 1987 D) 1986" ,
                "A) Venus B) Mars C) Earth D) Saturn" ,
                "A) Amazon B) Mississippi C) Nile D) Yangtze" ,
                "A) Silver B) Tin C) Copper D) Mercury" ,
                "A) Labour Party B) Nazi Party C) Ku-Klux-Klan D) Democratic Party"};
            
            char ans[] = {'A' , 'B' , 'C' , 'D' , 'B'};
            int score = 0;
            int totalques = ques.length;
            System.out.println("WELCOME TO THE BRAIN BUZZ QUIZ");
            System.out.println("The time limit for answering the questions is only 30 seconds");
            System.out.println("Your options are A, B , C and D select any one of them as an answer of that question.\n");
            long timer = System.currentTimeMillis();
            long duration = 30 * 1000;
            for (int i=0 ; i<totalques ; i++)
            {
                System.out.println("Question" + (i+1) + "is:" +ques[i]);
                System.out.println("option is:" +opt[i]);
                
                userAns = sc.nextLine().toUpperCase();
                choice = userAns.charAt(0);
                
                if(choice==ans[i]){
                    System.out.println("Yahooo! your is correct\n");
                    score++;
                } else{
                    System.out.println("opps! your answer is Incorrect. The correct ans is :" +ans[i]);
                }
                long timeup = System.currentTimeMillis()-timer;
                if(timeup>=duration){
                    System.out.println("Your time is up");
                    break;
                }
            }
            System.out.println("Quiz ended");
            System.out.println("Your score is :" +score);
        }
    }
}