package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException { 
	public Class loadClass(String fileName, String className) throws
		FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
		
	} // 예외 처리를 미루는 메서드입니다. 클래스내에서 파일을 가져오고 클래스를 로딩을 시도하는데 이 두 가지가 없는 경우
		// 예외가 발생합니다. 이 두 가지의 예외를 던진다. 즉, 미룬다는 뜻입니다.
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		}// 미룬 예외를 main함수 내에서 메서드를 호출 할 때 여기서 처리한다는 의미입니다.
	}
	

}


