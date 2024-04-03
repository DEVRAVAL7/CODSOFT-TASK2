import java.util.Scanner;
public class task2 {
    public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks Out Of 100 :");
		System.out.println("English :");
		int m1 = sc.nextInt();
		System.out.println("Mathematic:");
		int m2 = sc.nextInt();
		System.out.println("Science:");
		int m3 = sc.nextInt();
		System.out.println("history:");
		int m4 = sc.nextInt();
		System.out.println("Hindi :");
		int m5 = sc.nextInt();
		int Total = m1+m2+m3+m4+m5;

		float per = Total/5;
		System.out.println("Total Marks :"+Total);
		System.out.println("average Percentage of result :"+per);	
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}    
}
