package com.lz.elasticsearch.api;

import com.lz.elasticsearch.dto.UserDto;
import com.lz.elasticsearch.mapperStruct.UserDtoStruct;
import com.lz.elasticsearch.service.ElasticService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author sy
 * @date 2020/01/16
 */
@RestController
@Api
@RequestMapping("/elastic")
public class TestElasticApi {

    @Autowired
    private ElasticService elasticService;

    @PostMapping("/add")
    @ApiOperation("add")
    public void add(@RequestBody @Valid UserDto userDto) {
        elasticService.add(UserDtoStruct.MAPPER.userDto2user(userDto));
    }

    @GetMapping("/search")
    @ApiOperation("searchById")
    public UserDto searchById(Integer id) {
        return UserDtoStruct.MAPPER.user2UserDto(elasticService.searchById(id));
    }

    @GetMapping("/searchByNameAndAge")
    @ApiOperation("searchByNameAndAge")
    public UserDto searchByNameAndAge(String name, String age) {
        return UserDtoStruct.MAPPER.user2UserDto(elasticService.searchByNameAndAge(name, age));
    }

}
