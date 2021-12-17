package com.leetcode;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("abacaba"));
		System.out.println(isPalindrome(121));
	}
	
	 public static boolean isPalindrome(int x) {
		 boolean flag = true;
		 int rev=0;
		 int a =x;
		 if(x>=0) 
		 {
			 while(flag) {
				int rem= a%10;     
				int part = a/10;   
				rev = rem+(rev*10);  
				a=part;           
				if(a==0) {
					 flag=false;
				 }
			 }
		 if(rev==x) {
		 return true;
	     }else {
	    	 return false;
	     }
	    }
		 else {
			 return false;
		 }
		
		
	 }
	 
	 public static boolean isPalindrome(String x) {
		 char[] a = x.toCharArray();
		 String str ="";
		 for(int i=a.length-1; i>=0;i--) {
			 str =str+a[i];
		 }
		 if(str.equals(x)) {
			 return true;
		 }else {
			 return false;
		 }
	 }
}
