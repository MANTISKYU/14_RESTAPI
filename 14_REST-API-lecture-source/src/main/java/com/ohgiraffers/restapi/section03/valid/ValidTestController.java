package com.ohgiraffers.restapi.section03.valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valid")
public class ValidTestController {

    // 에러상황에 대해 처리할수있는 컨트롤러를 따로 만들것
    @GetMapping("/users/{userNo}")
    public ResponseEntity<?> findUserByNo() throws UserNotFoundException {

        // 항상 UserNotFoundException 을 던지게 함
        boolean check = true;
        if(check) {
            throw new UserNotFoundException("회원 정보를 찾을 수 없습니다.");
        }

        return ResponseEntity.ok().build();
    }
}