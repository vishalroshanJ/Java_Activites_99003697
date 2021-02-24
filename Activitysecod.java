import java.util.Scanner;
import java.util.*;

class Activitysecod
{
    /*int add(int num1, int num2)
   {
        return num1+num2;
    }
    int sub(int num1, int num2,)
    {
        return num1-num2;
    }
    int product(int num1, int num2)
    {
        return num1*num2;
    }
    int div(int num1, int num2)
    {
        return num1/num2;
    }*/
    public static void main(String[] args) 
    {    
    	JavaExample obj = new JavaExample();
         int a=0;
        Scanner scanner = new Scanner(System.in);  
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        operation = scanner.nextInt();
        if( first>32767 && first<0) && (second>32767 && second<0))
         {
         a=1;
         }
        operation = scanner.nextInt();
        if(a==1)
        {
        if(operation==1)
        {
        System.out.println(num1+num2);
        }
        else if(operation==2)
        {
       // System.out.println(obj.sub(first,second));
           System.out.println(num1-num2);
        }
        else if(operation==3)
        {
      //  System.out.println(obj.product(first,second));
        System.out.println(num1*num2);}
        else if(operation==4)
        {
        //System.out.println(obj.div(first,second));
        System.out.println(num1/num2);}
        else
        {
        System.out.println("invalid input");
        }
        }
        else
        {
        System.out.println("invalid input");
        }
       
    }



