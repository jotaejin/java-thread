package util;

import thread.bounded.BoundedQueue;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;

public abstract class MyLogger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void log(Object obj){
        String time = LocalTime.now().format(formatter);
        System.out.printf("%s [%9s] %s\n", time,Thread.currentThread().getName(), obj);
    }
}

