package com.lz.elasticsearch.repository.jpa;

import com.lz.elasticsearch.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * @author liuz
 * @version 1.0
 * @date 2020/1/15 0015 15:59
 */
public interface MyJpaRepository extends CrudRepository<Person, Integer> {
}
