package exercise8;

import java.io.IOException;

public class InputOuputTest {

	public static void main(String[] args){
		int i = 0;
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//returns ASCII code of 1st character  
		System.out.println((char)i);//will print the character 

	}

}
