package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {

    private long id;
    @NotEmpty(message = "Name should not empty")
    private String name;
    @NotEmpty(message = "Email should not empty")
    @Email
    private String email;
    @NotEmpty(message = "Body should not empty")
    @Size(min = 10, message = "Comment should not empty")
    private String body;
}
