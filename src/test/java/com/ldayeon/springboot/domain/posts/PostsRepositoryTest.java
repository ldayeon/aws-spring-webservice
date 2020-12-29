package com.ldayeon.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){}
    //given
    String title = "테스트 게시글";
    String content = "테스트 본문";

    PostsRepository.save(Posts.builder()
            .title())
}
