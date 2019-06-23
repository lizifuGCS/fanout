package com.qst.fanoutconsumer;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;


@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.sms}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.FANOUT)
        )
)
public class SmsReciver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("Sms===============Reciver +"+msg);

    }
}
