package com.lme.robot.commands;

import com.lme.robot.MarsRobot;

public class MoveCommand implements ICommand {

    @Override
    public void execute(final MarsRobot robot) {
        robot.move();
    }
}
