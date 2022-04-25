package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class StudentDto {
    private long id;
    private String name;
}
