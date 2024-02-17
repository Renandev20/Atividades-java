import java.util.Scanner;

public class positivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan =  new Scanner(System.in);
      int num; 
      System.out.println("me informe um número ");
      num = scan.nextInt();
      if(num < 0 ) {
    	  System.out.println("esse numero e menor do que  zero, ou seja  é um número negativo");
    	  System.out.println(num * (-1)    + "agora é numero positvo");
      }
      else {
    	  System.out.println("esse numero e maior do  que zero, ou seja é um número positivo");
      }
	}

}
