import java.util.Scanner; 
public class Maximum 
{
    public static void main(String[] args) 
    { 
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int max = 6;
        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter your first integer: ");
        number1 = input.nextInt();
        System.out.println("Enter your second integer: ");
        number2 = input.nextInt();
        System.out.println("Enter your third integer: ");
        number3 = input.nextInt();

        if (number1 >= number2) 
        {
            max = number1;
        }
        if (number2 >= number1)
        {
            max = number2;
        }
        if (number3 >= max)
        {
            max = number3;
        }
        System.out.println("The maximun is: " + max);
    }
}
