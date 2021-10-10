package com.javarabbitmq.springbootrabbitmq.consumer;

import com.javarabbitmq.springbootrabbitmq.config.MessagingConfig;
import com.javarabbitmq.springbootrabbitmq.dto.StatusBerita;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(StatusBerita Statusberita) {
        System.out.println("Message recieved from queue : " + Statusberita);
    }
}