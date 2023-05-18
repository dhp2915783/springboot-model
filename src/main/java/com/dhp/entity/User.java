package com.dhp.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
