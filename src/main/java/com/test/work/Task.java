package com.test.work;

class Thread1 implements Runnable
{

    /**
     *
     */
    @Override
    public void run()
    {
        System.out.println("Thread is running");
    }
}
public class Task
{

    public void myTask()
    {
        Thread thread = new Thread(new Thread1());
        thread.start();
    }
}
