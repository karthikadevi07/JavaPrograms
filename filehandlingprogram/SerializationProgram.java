package filehandlingprogram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationProgram {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		Employee employee = new Employee(30, "Karthikadevi N", "Programmer");
		
		FileOutputStream outputStream = new FileOutputStream("E:\\karthika\\xyz.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("Converted emp obj into byte stream");
	}


	}

