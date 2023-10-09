package com.springrest.SpringRestAPI.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Course {
    private long id;
    private String title;
    private String instructor;
    private String description;
    private long duration;
}
