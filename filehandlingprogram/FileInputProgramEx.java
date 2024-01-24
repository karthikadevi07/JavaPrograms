package filehandlingprogram;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputProgramEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputstream=new FileInputStream("E:\\karthika\\abc.txt");
		int i=0;
		while((i=inputstream.read())!=-1) {
			System.out.print((char)i);
			
		}
        inputstream.close();

	}

}
