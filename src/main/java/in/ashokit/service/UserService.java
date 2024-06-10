package in.ashokit.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;
import jakarta.persistence.criteria.Path;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void saveData() throws Exception {
		
		String imagePah = "C:\\Users\\Suraj Patil\\OneDrive\\Pictures\\Bms12.png";
		
		User user = new User();
		user.setUserName("Suraj");
		user.setUserEmail("sp@gmail.com");
		
		long size = Files.size(Paths.get(imagePah));
		System.out.println(size);
		byte[] arr = new byte[(int) size];
		FileInputStream fis =new FileInputStream(new File(imagePah));
		fis.read(arr);
		fis.close();
		
		user.setUserImg(arr);
	   userRepo.save(user);
		
	}
}
