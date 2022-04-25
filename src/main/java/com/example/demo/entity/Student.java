package com.example.demo.entity;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
}
