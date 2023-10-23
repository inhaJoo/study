package com.example.graphqltest;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    public User getUser(String oid) {
        User user1 = new User();
        user1.setOid("123");
        user1.setUserId("kimbs");
        user1.setName("반디");
        user1.setEmail("bandi@bandisnc.com");

        System.out.println("사용자 정보를 갖고 갑니다.");

        return user1;
    }
}
