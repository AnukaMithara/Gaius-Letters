//https://github.com/AnukaMithara

import java.util.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		String a = in.nextLine();
        char[] arr = a.toCharArray();
        for(int i = 0;i<arr.length;i++){
            int temp = (int)arr[i];
            if(temp>=65 && temp<=90){
                temp = ((temp -51) % 26)+65;
                arr[i] = (char)temp;
            }else if(temp>=97 && temp<=122){
                temp = ((temp -83) % 26)+97;
                arr[i] = (char)temp;
              }        
        }
		System.out.print(arr);
	}
}
