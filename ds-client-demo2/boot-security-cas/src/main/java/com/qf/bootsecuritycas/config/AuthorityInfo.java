package com.qf.bootsecuritycas.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

/**
 * 自定义权限信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityInfo implements GrantedAuthority {
    private String authority;
}
