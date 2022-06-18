package com.fzg.entity;

import com.fzg.myinterface.MyInterface;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component(value = "myRepo")
public class Repository {
    @Autowired
    @Qualifier(value = "ds")
    private DataSource dataSource;

    @Autowired
    @Qualifier(value = "myImpl1")
    private MyInterface myInterface;
}
