package com.study.springcloud.auth.repository;

import com.study.springcloud.auth.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tonny on 2019/9/22.
 *
 * @author Tonny
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Long> {
}
