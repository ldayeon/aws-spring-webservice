package com.ldayeon.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Springboot의 자동설정, 스프링 Bean 읽기&생성 모두 자동으로 설정 : 이 코드가 있는 곳부터 설정을 읽음
@EnableJpaAuditing
@SpringBootApplication
public class  Application { //main class
    public static void main(String[] args){
        //SpringApplication.run : 내장 WAS(톰캣x-> Jar 패키징 파일 사용)를 실행
        SpringApplication.run(Application.class,args);
    }
}
