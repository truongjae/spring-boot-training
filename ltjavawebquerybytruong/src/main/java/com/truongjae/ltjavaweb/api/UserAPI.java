package com.truongjae.ltjavaweb.api;

import com.truongjae.ltjavaweb.dto.RoleDTO;
import com.truongjae.ltjavaweb.dto.UserDTO;
import com.truongjae.ltjavaweb.dto.UserDTO2;
import com.truongjae.ltjavaweb.entity.UserEntity;
import com.truongjae.ltjavaweb.mapper.RoleMapper;
import com.truongjae.ltjavaweb.mapper.UserMapper;
import com.truongjae.ltjavaweb.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class UserAPI {
    private final UserService userService;
    private final UserMapper userMapper;
    private final RoleMapper roleMapper;
//    @GetMapping("/showuser")
//    public ResponseEntity<List<UserDTO2>> test3(@RequestBody long id[]){
//        List<UserEntity> userEntities = userService.findById(id[0]).stream().collect(Collectors.toList());
//        List<UserDTO2> userDTO2s = userMapper.from(userEntities);
//        return new ResponseEntity<>(userDTO2s, HttpStatus.ACCEPTED);
//    }
    @GetMapping("/showuser")
    public ResponseEntity<List<UserDTO2>> test3(@RequestBody long id[]){
        List<UserEntity> userEntities = userService.findById(id[0]).stream().collect(Collectors.toList());
        List<UserDTO2> userDTO2List = new ArrayList<>();
        for(UserEntity userEntity : userEntities){
            UserDTO2 userDTO2 = userMapper.from(userEntity);
            List<RoleDTO> roleDTOS = roleMapper.from(userEntity.getRoles());
            userDTO2.setRoles(roleDTOS);
            userDTO2List.add(userDTO2);
        }

//        UserEntity userEntity = userEntities.get(0);
//        List<RoleDTO> roleDTOS = roleMapper.from(userEntity.getRoles());
//        UserDTO2 userDTO2 = userMapper.from(userEntity);
//        userDTO2.setRoles(roleDTOS);
        return new ResponseEntity<>(userDTO2List, HttpStatus.ACCEPTED);
    }
}
