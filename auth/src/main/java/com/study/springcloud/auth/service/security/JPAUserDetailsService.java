package com.study.springcloud.auth.service.security;

import com.study.springcloud.auth.repository.UserRepository;
import com.study.springcloud.auth.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Tonny on 2019/9/22.
 *
 * @author Tonny
 */
@Service
public class JPAUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("========================"+username);

        User user = userRepository.findByUsername(username);
        System.out.println("---------------------------"+user.getPassword());
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }
}
