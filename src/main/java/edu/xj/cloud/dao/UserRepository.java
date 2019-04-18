package edu.xj.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.xj.cloud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
