package com.qf.bootsecuritycas.config;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 用户信息
 * @、这里我写了几个较为常用的字段，id，name，username，password，可以根据实际的情况自己增加
 * @author ChengLi
 *
 */
@Data
public class UserInfo implements UserDetails {
    private Long id;
    private String name;
    private String username;
    private String password;
    private boolean isAccountNonExpired = true;
    private boolean isAccountNonLocked = true;
    private boolean isCredentialsNonExpired = true;
    private boolean isEnabled = true;
    private Set<AuthorityInfo> authorities = new HashSet<AuthorityInfo>();
}
