
package java_pro;
import java.util.*;
public class java_subString_com {

	    public static void main(String[]args){
	    	LinkedHashSet<Object> k=new LinkedHashSet<Object>();
	    	String a="adskffk";
	         char[] arr=a.toCharArray();
	         ArrayList<Object> ans=new ArrayList<Object> (Arrays.asList(a.split("")));
	        int n=(int)(a.chars().filter(x ->x=='k').count());
	        System.out.println(n);
	        System.out.println(ans);
	        //ArrayList ans = new ArrayList(Arrays.asList(list));
	        k.addAll(ans);
	        System.out.println(k);
	       
	    }
	    
	}