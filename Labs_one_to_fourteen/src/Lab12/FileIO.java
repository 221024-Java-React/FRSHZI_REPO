package Lab12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO<T> {

	private String filename;

	public FileIO(String filename) {
		this.filename = filename;
	}

	public T readObject() {

		T ret;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			ret = (T) ois.readObject();
			return ret;
		} catch (FileNotFoundException e) {
			
			System.out.println("No one has written to the file yet");
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return null;

	}

	public void writeObject(T object) {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(object);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
