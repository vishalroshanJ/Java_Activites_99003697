package activitys;
import java.util.Scanner;
import java.util.*;

public class activityone {
    public static void main(String[] args) 
    {   int a=0;
        Scanner scanner = new Scanner(System.in);  
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int operation = scanner.nextInt();
        if(( num1<32767 && num1>0) && (num2<32767 && num2>0))
         a=1;
        if(a==1){
        if(operation==1)
        System.out.println(num1+num2); 
        else if(operation==2)
        System.out.println(num1-num2);
        else if(operation==3)
        System.out.println(num1*num2);
        else if(operation==4)
        System.out.println(num1/num2);
        else
        System.out.println("invalid input");}
        else
        System.out.println("invalid input");
    }}
