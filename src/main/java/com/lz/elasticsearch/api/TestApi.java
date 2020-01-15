package com.lz.elasticsearch.api;

import com.lz.elasticsearch.entity.User;
import com.lz.elasticsearch.repository.elasticsearch.MyElasticRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sy
 * @date 2020/01/15
 */
@RestController
@Api
public class TestApi {

    @Autowired
    private MyElasticRepository myElasticRepository;

    @PostMapping("/add")
    @ApiOperation("add")
    public void add() {

        myElasticRepository.save(User.builder().id(1).build());
    }
}
