package com.truongjae.news.mapper.user;

import com.truongjae.news.dto.UserDTO;
import com.truongjae.news.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2022-01-24T19:13:35+0700",
        comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Oracle Corporation)"
)
@Component
public class UserSaveMapperImpl implements UserSaveMapper {

    @Override
    public User to(UserDTO obj) {
        if ( obj == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( obj.getUserName() );
        user.setPassword( obj.getPassword() );
        user.setFullName(obj.getFullName());
        user.setStatus(obj.getStatus());

        return user;
    }

}