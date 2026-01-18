import java.util.Scanner;
public class Sixth{
    public static void main(String[] args) {
        int principle , timeDuretion ;
        float rate;
        Scanner Calc = new Scanner(System.in);
        System.out.print("Enter the principle : ");
        principle = Calc.nextInt();

        System.out.print("Enter the timeDuretion : ");
        timeDuretion = Calc.nextInt();
        System.out.print("Enter the rate : ");
        rate = Calc.nextFloat();

    float Intrest = (principle*timeDuretion*rate)/100;
        System.out.println("The final Intrest is : " + (int)Intrest);
    }
}