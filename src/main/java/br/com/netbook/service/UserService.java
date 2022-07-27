package br.com.netbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.netbook.dto.DTOUser;
import br.com.netbook.exceptions.ApiException;
import br.com.netbook.jpa.JPAUser;
import br.com.netbook.mapper.UserMapper;
import br.com.netbook.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserMapper userMapper;

	public DTOUser create(DTOUser user) {
		try {
			JPAUser jpaUser = userMapper.dtoToJpa(user);
			JPAUser jpaUserPersisted = userRepository.save(jpaUser);
			DTOUser dtoUser = userMapper.jpaToDto(jpaUserPersisted);

			return dtoUser;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApiException("Unable to persist the user.", HttpStatus.BAD_REQUEST);
		}
	}

}
