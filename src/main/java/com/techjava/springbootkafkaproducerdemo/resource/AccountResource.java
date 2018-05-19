package com.techjava.springbootkafkaproducerdemo.resource;


import com.techjava.springbootkafkaproducerdemo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class AccountResource {

    @Autowired
    private KafkaTemplate<String, Account> kafkaTemplate;

    @GetMapping("/acc/{accountName}")
    public String helloString(@PathVariable String accountName){
            kafkaTemplate.send("kafka_json", new Account(accountName,"12345"));
            return "Published Account Details Successfully";
    }

}
