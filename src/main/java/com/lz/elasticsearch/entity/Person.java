package com.lz.elasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author liuz
 * @date 2020/1/15
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private Integer id;

    private String userName;

    private String password;
}
