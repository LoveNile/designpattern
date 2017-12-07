package com.nile.design.Command;

/**
 * 定义执行命令的接口，所有命令的接收者都要实现此接口。
 * 命令模式将动作的执行者和发出者解耦，发出者只知道执行execute方法就可以完成任务，但是内部的细节一概不知。
 * 此代码的意义是模拟将命令注入到遥控器，遥控电灯的开闭。
 */
public interface Command {
    public void execute();
}
