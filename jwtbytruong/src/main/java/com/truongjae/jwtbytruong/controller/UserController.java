package com.truongjae.jwtbytruong.controller;

import com.truongjae.jwtbytruong.config.JwtTokenUtil;
import com.truongjae.jwtbytruong.model.jwt.JwtRequest;
import com.truongjae.jwtbytruong.model.jwt.JwtResponse;
import com.truongjae.jwtbytruong.model.user.UserSaveRequest;
import com.truongjae.jwtbytruong.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/reg")
    public ResponseEntity<?> addUser(@RequestBody UserSaveRequest userSaveRequest){
        UserSaveRequest user = userService.save(userSaveRequest);
        if(user != null)
            return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
        return new ResponseEntity<>("error", HttpStatus.NOT_ACCEPTABLE);
    }
    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        final UserDetails userDetails = userService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }
    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
