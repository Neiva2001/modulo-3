package teste;
import java.util.Scanner ;
public class numeros_binarios {


		public static void main (String[] args) {  
			Scanner dados = new Scanner (System.in);
			long num;
			System.out.println("Qual o numero binario");
			num = dados.nextInt();
		     int decimal = convertBinaryToDecimal(num);
	        System.out.printf("%d em binário = %d em decimal", num, decimal);
	    }

	    public static int convertBinaryToDecimal(long num)
	    {
	        int decimalNumber = 0, i = 0;
	        long remainder;
	        while (num != 0)
	        {
	            remainder = num % 10;
	            num /= 10;
	            decimalNumber += remainder * Math.pow(2, i);
	            ++i;
	        }
	        return decimalNumber;
		
		
		
		
		  }
		}	
		
