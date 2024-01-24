package filehandlingprogram;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream outputStream=new FileOutputStream("E:\\karthika\\abc.txt",true);
		String str=" I Love my Friends";
		byte bArray[]=str.getBytes();
		outputStream.write(bArray);
		outputStream.close();
		System.out.println("File Created");

	}

}
