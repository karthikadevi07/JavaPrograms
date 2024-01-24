package filehandlingprogram;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fileWriter=new FileWriter("E:\\karthika\\kd.txt",true);
		fileWriter.write("Karthikadevi N");
		fileWriter.close();
		System.out.println("File Created");

	}

}
