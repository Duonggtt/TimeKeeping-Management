package com.spring3.oauth.jwt.repositories;

import com.spring3.oauth.jwt.helpers.RefreshableCRUDRepository;
import com.spring3.oauth.jwt.entity.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends RefreshableCRUDRepository<User, Integer> {

   public User findByUsername(String username);
   User findFirstById(Integer id);

}
