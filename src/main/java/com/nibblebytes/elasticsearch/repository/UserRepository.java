package com.nibblebytes.elasticsearch.repository;

import com.nibblebytes.elasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User,String> {
}
