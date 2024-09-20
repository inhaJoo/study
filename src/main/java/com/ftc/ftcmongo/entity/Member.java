package com.ftc.ftcmongo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "member")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    private String id;
    private String userName;
    private String email;
}
