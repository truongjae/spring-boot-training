package com.truongjae.news.api.admin;

import com.truongjae.news.dto.UserDTO;
import com.truongjae.news.entity.User;
import com.truongjae.news.mapper.user.UserSaveMapper;
import com.truongjae.news.repository.UserRepository;
import com.truongjae.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsAPI {
    @Autowired
    private UserService userService;
    @GetMapping(value = "showuser")
    public String user(){
//        List<User> userList = userService.findAll();
//        StringBuilder stringBuilder = new StringBuilder();
//        for(User user : userList){
//            stringBuilder.append(user.getUserName()+"</br>");
//        }
//        return stringBuilder.toString();
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <form action=\"http://localhost:9090/test\" method=\"post\">\n" +
                "        <input type=\"text\" name=\"userName\" id=\"userName\">\n" +
                "        <input type=\"text\" name=\"password\" id=\"password\">\n" +
                "        <input type=\"text\" name=\"fullName\" id=\"fullName\">\n" +
                "        <input type=\"number\" name=\"status\" id=\"status\">\n" +
                "        <input type=\"submit\" name=\"submit\" id=\"submit\">\n" +
                "    </form>\n" +
                "    <button id=\"button\">button</button>\n" +
                "    <script>\n" +
                "        $(\"button\").click(function(){\n" +
                "            $.get(\"http://localhost:9090/test2\", function(data, status){\n" +
                "            console.log(data);\n" +
                "            console.log(status);\n" +
                "            });\n" +
                "        });\n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
    }
    @PostMapping(value = "api/user")
    public UserDTO createNews(@RequestBody UserDTO userDTO){
        return userDTO;
    }

    @PostMapping(value = "/test")
    public ResponseEntity<User> test(@RequestBody UserDTO userDTO){
        User user = userService.save(userDTO);
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/test2")
    public ResponseEntity<List<User>> test2(){
        List<User> user = userService.findAll();
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/test3")
    public void test3(@RequestBody long[] id){

        userService.deleteById(id[0]);
    }
    @PutMapping(value = "/test4")
    public void test4(@RequestBody int[] id){
        userService.update();
    }
    @GetMapping(value = "/test5")
    public ResponseEntity<User> test5(@RequestBody String userName){
        User user = userService.findByUserName(userName);
        return new ResponseEntity<>(user,HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/test6")
    public ResponseEntity<List<User>> test6(@RequestBody long[] id){
        List<User> listUser = userService.findAllUsers();
        return new ResponseEntity<>(listUser,HttpStatus.ACCEPTED);
    }

}
