package com.qst.fanout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FanoutApplication.class)
public class FanoutApplicationTests {

    @Autowired
    private OrderProvider orderProvider;

    @Test
    public void sender() throws InterruptedException {
        while(true){
            Thread.sleep(3000);
            orderProvider.send("你好，这里是广播模式！");
        }
    }

}
