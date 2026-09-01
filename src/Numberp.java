import java.util.Scanner;
class  Numberp{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int evensum =0;
        int oddsum =0;
        int LargestM =-1;


        System.out.print("Enter The Number:");
        int N  = sc.nextInt();
        System.out.print("NUMBER:");

        for (int i =1; i <= N;i++ ){

            System.out.print(i + ",");

            if(i % 2 ==0 )

                evensum +=i;
            else
                oddsum++;

            if (i % 5 ==0)
                LargestM = i;


        }
        System.out.println(" ");
        System.out.println("======================================== ");
        System.out.println("Sum Even = "+ evensum);
        System.out.println("Total ODD = "+ oddsum);
        System.out.println("Lagrest Multiplication of 5 = "+ LargestM);
        System.out.println("======================================== ");

    }
}
