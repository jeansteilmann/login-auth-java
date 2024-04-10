package com.jean.loginauthapi.repositories;

import com.jean.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    Optional<User> findByEmail(String email);
}
