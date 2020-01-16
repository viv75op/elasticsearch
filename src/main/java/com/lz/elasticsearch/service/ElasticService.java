package com.lz.elasticsearch.service;

import com.lz.elasticsearch.entity.User;
import com.lz.elasticsearch.repository.elasticsearch.MyElasticRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author sy
 * @date 2020/01/16
 */
@Service
public class ElasticService {

    @Autowired
    private MyElasticRepository myElasticRepository;

    @PostMapping("/add")
    @ApiOperation("add")
    public void add(@RequestBody User user) {

        myElasticRepository.save(user);
    }

    @GetMapping("/search")
    @ApiOperation("searchById")
    public User searchById(Integer id) {

        return myElasticRepository.findById(id).orElse(new User());
    }

    public User searchByNameAndAge(String name, String age) {

        return myElasticRepository.findByNameAndAge(name, age)
                .orElse(new User());
    }
}
