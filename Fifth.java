import java.util.Scanner;
public class Fifth{
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner Number = new Scanner(System.in);

        System.out.print("Enter the number : ");
        num = Number.nextInt();
        for(int k = 1;k<=num;k++)
        {
            fact *= k;
        }
        System.out.println(fact);

    }
}