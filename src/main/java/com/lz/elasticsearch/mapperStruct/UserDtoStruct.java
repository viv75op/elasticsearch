package com.lz.elasticsearch.mapperStruct;

import com.lz.elasticsearch.dto.UserDto;
import com.lz.elasticsearch.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author sy
 * @date 2020/01/16
 */
@Mapper
public interface UserDtoStruct {
    UserDtoStruct MAPPER = Mappers.getMapper(UserDtoStruct.class);

    User userDto2user(UserDto userDto);

    UserDto user2UserDto(User user);

}
