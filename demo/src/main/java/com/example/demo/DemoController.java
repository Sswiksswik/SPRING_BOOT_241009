package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class DemoController
{
    @GetMapping(
        "/hello"
    ) // 전송 방식 GET
    public String hello(Model model) {
        model.addAttribute("data", "방갑습니다."); // model 설정
        return "hello"; 
    }

    @GetMapping(
        "/hello2"
    ) // 전송 방식 GET
    public String hello2(Model model) {
        // 5개의 속성을 Model에 추가
        model.addAttribute("username", "홍길동님"); // 1. 사용자 이름
        model.addAttribute("greeting", "반갑습니다."); // 2. 인사말
        model.addAttribute("today", "오늘"); // 3. 오늘 날짜/정보
        model.addAttribute("weather", "매우 좋습니다."); // 4. 날씨
        model.addAttribute("status", "성공적으로 두 번째 페이지를 로드했습니다."); // 5. 상태 메시지


        return "hello2"; 
    }
}