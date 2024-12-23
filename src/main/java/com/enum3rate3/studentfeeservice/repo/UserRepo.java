package com.enum3rate3.studentfeeservice.repo;

import com.enum3rate3.studentfeeservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}