package javaapplication9;
import java.util.Scanner;
public class JavaApplication9 {

    
    static int lereescrever (int X)
{
    Scanner LerS=new Scanner (System.in);
   System.out.print("Qual a primeira nota do aluno ?");
   X = LerS.nextInt();
   System.out.print("A nota do aluno é : "+X);
return X;
   
}
  public static void main(String[] args)throws Exception  {
      int X=0 ;
     int [] Armario = new int [26];
       for (int aluno =1; aluno < 26; aluno++ )
           Armario [aluno] = lereescrever (X);
       for (int aluno = 1; aluno < 26; aluno++ )
           System.out.println ( aluno + "-" +Armario [aluno]);
    }
    
}
