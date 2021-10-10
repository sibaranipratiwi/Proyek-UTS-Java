package com.javarabbitmq.springbootrabbitmq.publisher;

import com.javarabbitmq.springbootrabbitmq.config.MessagingConfig;
import com.javarabbitmq.springbootrabbitmq.dto.Berita;
import com.javarabbitmq.springbootrabbitmq.dto.StatusBerita;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/berita")
public class Publisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{newsName}")
    public String bookOrder(@RequestBody Berita berita, @PathVariable String newsName) {
        berita.setBeritaId(UUID.randomUUID().toString());
        //newsservice
        StatusBerita statusBerita = new StatusBerita(berita, "PROCESS", "Information of news placed succesfully in " +newsName);
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, statusBerita);
        return "Success to placed news!!";
    }
}
