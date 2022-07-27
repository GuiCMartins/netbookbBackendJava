package br.com.netbook.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.netbook.dto.DTOUser;
import br.com.netbook.jpa.JPAUser;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	DTOUser jpaToDto(JPAUser user);

	JPAUser dtoToJpa(DTOUser dtoUser);
}
