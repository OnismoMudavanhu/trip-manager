package com.zt.tripmanager.domain;

import com.zt.tripmanager.common.Role;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String username;
    private String email;
    private String password;
    @Enumerated(value=EnumType.STRING)
    private Role role;
}
