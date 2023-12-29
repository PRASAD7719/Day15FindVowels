/* 
 * Statement:Vowels=a,e,i,o,u
 * I/P:Welcome to Java
 * O/P:6
 * 
 */

package main1;

public class Day15FindNumberOfVowels {
	public static void main(String[] args) {
		
		String str="Welcome to Java";
		str=str.toLowerCase();
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("total num of vowels :"+count);
	}

}
