import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringCount{

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int temp=0,count =0,i=0;
        long num=s.length();
        if(num==1){return (long)(n/num);}
         for(i=0;i<num;i++){
            if(s.charAt(i)=='a'){ count=count+1;}
             
        }
        System.out.println("+++"+count);
        temp = count;
		 count=0;
        long x =(long)((n/num*temp));
		System.out.println("???"+x);
        long a=(long)(n%num);
        for(i=0;i<a;i++){
            if(s.charAt(i)=='a'){count++;}
        }
		System.out.println("****"+count);
        return (x+count);

    }

    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long a = sc.nextLong();
		
		System.out.println(repeatedString(s,a));
	}
}
