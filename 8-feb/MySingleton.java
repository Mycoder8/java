import java.io.*;

public class MySingleton {
	static MySingleton instance = null;
	public String name = "John";

	
	// private constructor
	private MySingleton() {}
	
	// factory method to provide user the interface
	static public MySingleton getInstance(){
		if(instance == null){
			instance = new MySingleton();
		}
		else{

		}

		return instance;
	}
}