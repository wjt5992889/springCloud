package com.study.springcloud.auth.domain.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

/**
 * Created by Tonny on 2019/9/22.
 *
 * @author Tonny
 */
@MappedSuperclass
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(updatable = false, nullable = false)
    private Instant createTime;

    @Column(nullable = false)
    @JsonIgnore
    private Instant updateTime;

    @PrePersist
    public void prePersist() {
        createTime = updateTime = Instant.now();
    }
    @PreUpdate
    public void preUpdate() {
        updateTime = Instant.now();
    }
}
