package com.lz.elasticsearch.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author liuz
 * @version 1.0
 * @date 2020/1/15 0015 16:01
 */
@EnableElasticsearchRepositories("com.lz.elasticsearch.repository.elasticsearch")
@EnableJpaRepositories("com.lz.elasticsearch.repository.jpa")
@Configuration
public class RepositoryConfigration {

    /*
     * 两种方式区分repository究竟是jpa还是elasticsearch
     * 1.实体类使用@Entity或Document注解区分
     * 2.使用Enable***Repository的扫描路径
     */
}
