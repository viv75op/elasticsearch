package com.lz.elasticsearch.repository.jpa;

import com.lz.elasticsearch.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author liuz
 * @version 1.0
 * @date 2020/1/15 0015 15:59
 */
public interface MyJpaRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUserName(String userName);
}
