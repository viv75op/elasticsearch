package com.lz.elasticsearch.mapperStruct;

import com.lz.elasticsearch.dto.PersonDto;
import com.lz.elasticsearch.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author sy
 * @date 2020/01/16
 */

@Mapper
public interface PersonDtoStruct {

    PersonDtoStruct MAPPER = Mappers.getMapper(PersonDtoStruct.class);

    Person personDto2Person(PersonDto personDto);

    PersonDto person2PersonDto(Person person);
}
