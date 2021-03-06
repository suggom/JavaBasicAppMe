package io24.node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InOutExample {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = 
				new FileInputStream(
						"src/io24/node/STDNodeInOut.java");
		FileOutputStream fos = 
				new FileOutputStream(
						"src/io24/node/STDNodeInOut.txt");
		OutputStream os = System.out;
		
		int data;
		try {
			while((data=fis.read())!=-1) {
				fos.write(data);
				fos.flush();
				os.write(data);
				os.flush();
			}
		}catch(IOException e) {
			System.out.println("파일이 없숴요");
		}finally {
			try {
				fos.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
