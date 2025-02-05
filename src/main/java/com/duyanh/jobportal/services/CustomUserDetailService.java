package com.duyanh.jobportal.services;

import com.duyanh.jobportal.entity.Users;
import com.duyanh.jobportal.repository.UsersRepository;
import com.duyanh.jobportal.util.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// Tell Spring Security to retrieve the users from database
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Autowired
    public CustomUserDetailService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepository.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("Could not found user"));

        return new CustomUserDetails(user);
    }
}
