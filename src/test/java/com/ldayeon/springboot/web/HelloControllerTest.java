package com.ldayeon.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//JUnit에 내장된 실행자 외에 다른 실행자를 실행시킴
//여기서는 스프링 실행자인 'SpringRunner' 사용 - SpringBootTest와 JUnit 사이에 연결자 역할
@RunWith(SpringRunner.class)
//사용 가능 Annotation : @Controller, @ControllerAdvice
//사용 불가 Annotation : @Service, @Component, @Repository
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    //Spring이 관리하는 Bean을 주입받기
    @Autowired
    //웹API Test할 때 사용
    //GET, POST 등 API 테스트 가능
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello="hello";

        // '/hello' 주소로 Get 요청 받기
        mvc.perform(get("/hello"))
                .andExpect(status().isOk()) //mvc.perform의 결과 검증 & Header의 Status 검증
                .andExpect(content().string(hello)); //ResponseBody 검증 & Controller에서 반환한 값 확인
    }
}
