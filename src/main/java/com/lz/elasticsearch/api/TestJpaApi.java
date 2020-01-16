package com.lz.elasticsearch.api;

import com.lz.elasticsearch.dto.PersonDto;
import com.lz.elasticsearch.entity.Person;
import com.lz.elasticsearch.mapperStruct.PersonDtoStruct;
import com.lz.elasticsearch.service.JpaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author sy
 * @date 2020/01/15
 */
@RestController
@Api
@RequestMapping("/jpa")
public class TestJpaApi {

    @Autowired
    private JpaService jpaService;

    @PostMapping("/add")
    @ApiOperation("add")
    public void add(@RequestBody @Valid PersonDto personDto) {

        Person person = PersonDtoStruct.MAPPER.personDto2Person(personDto);
        jpaService.add(person);
    }

    @GetMapping("/searchById")
    @ApiOperation("searchById")
    public PersonDto searchById(Integer id) {

        Person person = jpaService.searchById(id);
        return PersonDtoStruct.MAPPER.person2PersonDto(person);
    }

    @GetMapping("/searchByUserName")
    @ApiOperation("searchByUserName")
    public PersonDto searchById(String userName) {

        Person person = jpaService.searchByUserName(userName);
        return PersonDtoStruct.MAPPER.person2PersonDto(person);
    }
}
