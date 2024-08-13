//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner; //This imports the console scanner that reads user input
public class program3{
    public static void main( String[]args){
        int numb1=0;
        int numb2= 0;
        int numb3= 0;
        int numb4= 0;
    
        
        Scanner numScanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        numb1=numScanner.nextInt();
        
        System.out.println("Enter the second number:");
        numb2=numScanner.nextInt();
        
        System.out.println("Enter the third number:");
        numb3=numScanner.nextInt();
        
        System.out.println("Enter the fourth number:");
        numb4=numScanner.nextInt();
        int sum= (numb1+numb2+numb3+numb4);
        double average=sum/4.0;
        System.out.println("The sum of the four numbers is: "+ sum);
        System.out.println("The average of the four numbers is: " + average);

        
    }
}


//Paste console output below:
/*
Enter the first number:
475
Enter the second number:
821
Enter the third number:
369
Enter the fourth number:
562
The sum of the four numbers is: 2227
The average of the four numbers is: 556.75

*/
