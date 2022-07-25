package br.com.netbook.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.netbook.dto.DTOUser;
import br.com.netbook.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public DTOUser create(@RequestBody DTOUser user) {
		return userService.create(user);
	}

	@GetMapping
	public void logIn(HttpServletRequest request) {
		System.out.println(request.getAttribute("firebaseUid").toString());
	}

}
