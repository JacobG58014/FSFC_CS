package Main;

import java.io.*;

public class TryCatch {
	static String test;


	public static void main(String args[]){
		
		System.out.println("Thing");
		Writer Jacob = null;
		try {
			Jacob = new FileWriter("Jacob");
			System.out.println("Thingy");
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		BufferedWriter fw = null;
		fw = new BufferedWriter(Jacob);
		System.out.println("Thing1");
		try {
			fw.append("HELLO");
			System.out.println("Thing2");
		} catch (IOException e) {
			System.out.println("Fail");
			e.printStackTrace();
		}

		System.out.println("Thing3");
	}

}
