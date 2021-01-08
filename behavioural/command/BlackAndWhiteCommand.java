package com.company.behavioural.command;

import com.company.behavioural.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
