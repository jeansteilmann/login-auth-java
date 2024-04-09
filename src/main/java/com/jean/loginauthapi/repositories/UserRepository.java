package com.jean.loginauthapi.repositories;

import com.jean.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String>{

}
