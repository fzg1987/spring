package com.fzg.repository.impl;

import com.fzg.repository.MyRepository;
import org.springframework.stereotype.Component;

@Component
public class MyRepositoryImpl implements MyRepository {
    @Override
    public String doRepository(Double score) {
        String result = "";
        if(score >=0 && score < 60){
            result = "不及格";
        }else if(score >= 60 && score < 80){
            result = "及格";
        } else if (score >= 80 && score < 100) {
            result = "优秀";
        } else {
            result = "成绩无效";
        }
        return result;
    }
}
