package com.tuyen.demo.usermanagement.service;

import com.tuyen.demo.usermanagement.dao.UserRepo;
import com.tuyen.demo.usermanagement.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo repo;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public void add(User user) {
        repo.save(user);
        sendMessage("user is created");
    }

    @Override
    public List<User> find() {
        return repo.findAll();
    }

    private void sendMessage(String message) {
        ListenableFuture<SendResult<String, String>> future =
                kafkaTemplate.send("mytopic", message);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {

            @Override
            public void onSuccess(SendResult<String, String> result) {
                System.out.println("Sent message=[" + message +
                        "] with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                System.out.println("Unable to send message=["
                        + message + "] due to : " + ex.getMessage());
            }
        });
    }
}
