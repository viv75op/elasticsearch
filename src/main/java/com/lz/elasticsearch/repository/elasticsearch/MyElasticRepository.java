package com.lz.elasticsearch.repository.elasticsearch;

import com.lz.elasticsearch.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author liuz
 * @version 1.0
 * @date 2020/1/15 0015 16:00
 */
@Repository
public interface MyElasticRepository extends CrudRepository<User, Integer> {

    Optional<User> findByNameAndAge(String name, String age);
}
