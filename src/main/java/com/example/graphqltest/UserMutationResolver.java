package com.example.graphqltest;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    public User addUser(UserAdd user){
        User user1 = new User();

        System.out.println("화면으로 부터 받아온 값");
        System.out.println(user.getOid());
        System.out.println(user.getUserId());
        System.out.println(user.getName());
        System.out.println(user.getEmail());

        user1.setOid(user.getOid());
        user1.setUserId(user.getUserId());
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());

        return user1;

        /*
            mutation 문법
            mutation addUser($userAdd: UserAdd){
              addUser(user:$userAdd){
                userId
              }
            }
        */
    }

    public User editUser(UserEdit user){
        User user1 = new User();

        System.out.println("화면에서 들어온 값");
        System.out.println(user.getOid());
        System.out.println(user.getUserId());
        System.out.println(user.getName());
        System.out.println(user.getEmail());

        user1.setOid(user.getOid());
        user1.setUserId(user.getUserId());
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());

        return user1;
    }

    public String removeUser(String oid){
        System.out.println(oid + "인값을 삭제합니다.");

        return oid;
    }
}
