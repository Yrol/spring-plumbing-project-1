package com.yrol.utils;

import com.yrol.plumbing.ball.Ball;
import com.yrol.plumbing.ball.BallType;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BallService {
    @Bean
    Ball newBall() {
        BallType ballType = new BallType();
        return new Ball(ballType);
    }
}
