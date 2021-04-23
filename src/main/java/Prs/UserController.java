package Prs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import Prs.UserRepository;
import Prs.User;

@Controller
@RequestMapping("/api/Users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/List")
	public @ResponseBody Iterable<User> GetAllUsers() {
		return userRepository.findAll();
	}

}
