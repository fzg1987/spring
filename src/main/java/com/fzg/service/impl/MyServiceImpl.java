package com.fzg.service.impl;

import com.fzg.repository.MyRepository;
import com.fzg.service.MyService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Component
public class MyServiceImpl implements MyService {
    @Autowired
    private MyRepository myRepository;
    @Override
    public String doService(Double score) {
        return myRepository.doRepository(score);
    }
}
