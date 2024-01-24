package filehandlingprogram;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("E:\\karthika\\kd.txt");
		int i;
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
		}
		reader.close();
		


	}

}
