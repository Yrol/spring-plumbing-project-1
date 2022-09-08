package com.yrol.plumbing.ball;

public class Ball {

    private BallType ballType;

    public Ball() {}

    public Ball(BallType ballType) {
        this.ballType = ballType;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }
}
