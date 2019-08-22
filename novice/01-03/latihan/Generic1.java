// A Simple Java program to show working of user defined 
// Generic classes 

// We use < > to specify Parameter type 
class Generic1<T> 
{ 
	// An object of type T is declared 
	T obj; 
	Generic1(T obj) { this.obj = obj; } // constructor 
	public T getObject() { return this.obj; } 
} 

// Driver class to test above 
public class Main 
{ 
	public static void main (String[] args) 
	{ 
		// instance of Integer type 
		Generic1 <Integer> iObj = new Generic1<Integer>(15); 
		System.out.println(iObj.getObject()); 

		// instance of String type 
		Generic1 <String> sObj = new Generic1<String>("GeeksForGeeks"); 
		System.out.println(sObj.getObject()); 
	} 
}
