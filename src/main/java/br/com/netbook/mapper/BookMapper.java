package br.com.netbook.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.netbook.dto.DTOBook;
import br.com.netbook.jpa.JPABook;

@Mapper(componentModel = "spring")
public interface BookMapper {
	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	DTOBook jpaToDto(JPABook user);

	JPABook dtoToJpa(DTOBook dtoUser);
}
