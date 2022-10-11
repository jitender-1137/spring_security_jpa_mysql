package com.example.spring_security_jpa_mysql.service;

import com.example.spring_security_jpa_mysql.dao.UserRepo;
import com.example.spring_security_jpa_mysql.models.MyUserDetails;
import com.example.spring_security_jpa_mysql.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Not Found " + username));
        return user.map(MyUserDetails::new).get();
    }
}
