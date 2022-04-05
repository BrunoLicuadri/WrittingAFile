package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Prorgam {

	public static void main(String[] args) {
		// Learning how to write a file using BufferedWriter and FileWriter
		String [] lines = new String[] {"Baltimore", "New York City", "Las Vegas"};
		String path = "C:\\Users\\Bruno\\Desktop\\Out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
