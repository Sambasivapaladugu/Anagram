		import java.util.Scanner;

		public class Solution {

		    static int NO_OF_CHARS = 256; 

		    static boolean isAnagram(String a, String b,String c,String d) {
		        String alower = a.toLowerCase();
		        String blower = b.toLowerCase();
		        String clower = c.toLowerCase();
		        String dlower=  d.toLowerCase();

		        char[] str1 = alower.toCharArray();
		        char[] str2 = blower.toCharArray();
		        char[] str3= clower.toCharArray();
		        char[] str4 = dlower.toCharArray();

		        int count1[] = new int[NO_OF_CHARS];  
		        int count2[] = new int[NO_OF_CHARS];
		        int count3[]= new int[NO_OF_CHARS];
		        int count4[]= new int[NO_OF_CHARS];
		        for(int c1=0; c1<NO_OF_CHARS; c1++){
		            count1[c1] = 0;
		            count2[c1] = 0;
		            count3[c1] =0;
		            count4[c1]=0;
		            
		        } 

		        int i; 
		        for (i = 0; i < str1.length && i < str2.length && i < str3.length && i< str4.length; i++) { 
		            count1[str1[i]]++; 
		            count2[str2[i]]++;
		            count3[str3[i]]++;
		            count4[str4[i]]++;
		        } 

		        if (str1.length != str2.length)
		            return false; 

		        for (i = 0; i < NO_OF_CHARS; i++) 
		            if (count1[i] != count2[i]) 
		                return false; 
		        return true; 
		    }

		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        String a = scan.next();
		        String b = scan.next();
		        String c = scan.next();
		        String d = scan.next();
		        scan.close();
		        boolean ret = isAnagram(a, b,c,d);
		        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		    }
		}	



