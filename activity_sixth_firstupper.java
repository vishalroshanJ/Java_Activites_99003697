package activitys;

import java.util.Scanner;



public class activity_sixth_firstupper {
	
	static String capitailizeWord(String str) {
        StringBuffer s = new StringBuffer();
 
  
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
             
           
            if (ch == ' ' && str.charAt(i) != ' ')
                s.append(Character.toUpperCase(str.charAt(i)));
            else
                s.append(str.charAt(i));
            ch = str.charAt(i);
        }
 
     
        return s.toString().trim();
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1= s.nextLine(); 
		String str2= s.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toUpperCase();
		System.out.println(capitailizeWord(str1)+"  "+str2);
	}

}
