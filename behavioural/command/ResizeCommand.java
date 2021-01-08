package com.company.behavioural.command;

import com.company.behavioural.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");

    }
}
