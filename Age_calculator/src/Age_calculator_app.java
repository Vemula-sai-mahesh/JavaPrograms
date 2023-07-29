
import java.util.Scanner; 

public class Age_calculator_app {

	public static void main(String[] args) {
		 
		//TODO Auto-generated method stub
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to the Age_calculator App.");
	System.out.println("Enter your name:");
	String name=scan.nextLine();
	System.out.println("Enter your date of birth:day/month/year\nExample:01/01/2000");
		boolean v=true;
			while(v) {
				String a=scan.nextLine();
				String [] arr=a.split("[/-]+");
				if (arr.length==3  && Integer.parseInt(arr[0])<=31 && Integer.parseInt(arr[1])<=12 )  {
					int d1=Integer.parseInt(arr[0]);
					int m1=Integer.parseInt(arr[1]);
					int y1=Integer.parseInt(arr[2]);
					String [] pres_da=java.time.LocalDate.now().toString().split("[-/]+");
					int d2=Integer.parseInt(pres_da[2]);
					int m2=Integer.parseInt(pres_da[1]);
					int y2=Integer.parseInt(pres_da[0]);
					int no_years=y2-y1;
					int no_mon;
					int no_day;
					if (m2<m1) {
						no_years-=1;
						no_mon=(12-m1)+m2;
					}
					else {
						no_mon=m2-m1;
					}
					if(d2<d1){
						no_mon-=1;
						no_day=(30-d1)+d2;
					}
					else {
						no_day=d2-d1;
					}
					System.out.println(name+", you are "+no_years+" years "+no_mon+" months "+no_day+" days");
					System.out.println("Do you want to know another person age: Enter==>Yes/No");
					String c=scan.nextLine();
					switch(c) {
						case "No":
							v=false;
							System.out.println("Thank's for using this application.");
							System.out.println("Have a nice day");
							break;
						case "Yes":
							System.out.println("Enter the name:");
							name=scan.nextLine();
							System.out.println("Enter your date of birth:day/month/year\nExample:01/01/2000");
							break;
						default:
							System.out.println("Invalid input");
							System.out.println("Thank's for using this application.");
							System.out.println("Have a nice day");
							break;
					}
				}
				else {
					System.out.println("Invalid Input");
					System.out.println("Thank's for using this application.");
					System.out.println("Have a nice day");
				}
			}
		}
			
}		
		
	


