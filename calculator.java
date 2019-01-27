import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		//added by person2
		float a , b, res;
		char choice , ch;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("1.Exit\n");
			System.out.println("2.Add Two Numbers\n");
			System.out.println("3.Multiply Two Numbers\n");
			System.out.println("Enter your choice\n");
			choice = scan.next().charAt(0);
			switch(choice){
				case '1': System.exit(0);
					  break;
				case '2': System.out.println("Enter 2 numbers\n");
                                          a = scan.nextFloat();
                                          b = scan.nextFloat();
                                          res = a+b;
                                          System.out.println("Result: "+res);
                                          break;
				case '3': System.out.println("Enter 2 numbers\n");
					  a = scan.nextFloat();
					  b = scan.nextFloat();
					  res = a*b;
					  System.out.println("Result: "+res);
				default : System.out.println("Invalid choice!!\n");
					  break;
			
			}
			System.out.println();
		}while(choice != 2);
	}
}
