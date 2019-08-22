import package_one.ClassTwo; 
import package_name.ClassOne; 

public class Package_one { 
	public static void main(String[] args){ 
		ClassTwo a = new ClassTwo(); 
		ClassOne b = new ClassOne(); 
		a.methodClassTwo(); 
		b.methodClassOne(); 
	} 
} 
