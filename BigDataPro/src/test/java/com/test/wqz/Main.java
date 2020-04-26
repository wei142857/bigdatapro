package com.test.wqz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.wqz.app.entity.User;

public class Main {
	public static void main(String[] args) throws Exception {
		
		User user = new User();
		user.setName("魏全振");
		user.setAge(20);
		serializeUser(user);
		User u = deSerializeUser();
		System.out.println(u);
	}
	public static void serializeUser(User user) throws IOException {
		File file = new File("D://obj/a.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.close();
	}
	public static User deSerializeUser() throws IOException, ClassNotFoundException {
		File file = new File("D://obj/a.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		User user = (User)ois.readObject();
		ois.close();
		return user;
	}
}
