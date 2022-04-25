package com.example.demo.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class StudentDto {
    private long id;
    private String name;
}
