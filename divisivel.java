import java.util.Scanner;
public class dividives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan =  new Scanner(System.in);
      int num; 
      System.out.println("me informe um número ");
      num = scan.nextInt();
      if(num%3 == 0) {
    	  System.out.println("esse número é divisivel por 3");
      }
      else {
    	  System.out.println("esse número  não é divisivel por 3");
      }
      if(num%2 == 0) {
    	  System.out.println("esse número é divisivel por 2");
      }
      else {
    	  System.out.println("esse número  não é divisivel por 2");
      }
}
}