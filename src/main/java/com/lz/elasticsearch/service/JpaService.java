package com.lz.elasticsearch.service;

import com.lz.elasticsearch.entity.Person;
import com.lz.elasticsearch.repository.jpa.MyJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author sy
 * @date 2020/01/16
 */
@Service
public class JpaService {

    @Autowired
    private MyJpaRepository jpaRepository;

    @Transactional(rollbackOn = Exception.class)
    public void add(Person person) {
        jpaRepository.save(person);
    }

    public Person searchById(Integer id) {
        return jpaRepository.findById(id).orElse(Person.builder().build());
    }

    public Person searchByUserName(String userName) {
        return jpaRepository.findByUserName(userName).orElse(Person.builder().build());
    }
}
