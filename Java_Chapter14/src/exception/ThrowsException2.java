package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {
	public Class loadClass(String fileName, String className)
		throws FileNotFoundException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		ThrowsException2 test = new ThrowsException2();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}//Exception 클래스로 그 외 예외상황 처리(항상 맨 밑에 적는다는 걸 잊지말자.)

	}

}
