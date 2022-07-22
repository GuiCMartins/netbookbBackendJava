package br.com.netbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.netbook.dto.DTOUser;
import br.com.netbook.exceptions.ApiException;
import br.com.netbook.jpa.JPAUser;
import br.com.netbook.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public DTOUser create(DTOUser user) {
		try {
			JPAUser jpaUserPersisted = userRepository
					.save(new JPAUser(user.getFirebaseId(), user.getName(), user.getEmail()));

			return new DTOUser(jpaUserPersisted);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApiException("Unable to persist the user.", HttpStatus.BAD_REQUEST);
		}
	}

}
