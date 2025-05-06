package org.example.mynewidea;

import jakarta.annotation.Resource;
import org.example.mynewidea.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author by 王玉涛
 * @Classname MyIdeaTest
 * @Description TODO
 * @Date 2025/5/6 11:44
 */
@SpringBootTest
public class MyIdeaTest {

    @Resource
    private UserService userService;

    @Test
    public void testMyIdeaWithMore() {
        long executionTime = 0L;
        for (int i = 0; i < 100; i++) {
            executionTime += testIdea((long) i);
        }
        System.out.println("平均耗时: " + executionTime / 100 + "ms");
    }

    private long testIdea(long userId) {
        long startTime = System.currentTimeMillis();
        userService.clickSession(userId);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /*@Test
    public void testMyIdeaWithOne() {

    }*/

}
