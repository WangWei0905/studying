package com.person.studying.day1;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author mr.wang
 * @Date 2024/7/22 1:09 下午
 * @Version 1.0
 */
public class Test01 {

    public static void main(String[] args) {
        Shower shower = new Shower(5, 2);
        for (int i = 0; i < 20; i++) {
            new Thread(new Man("man"+i, shower)).start();
            new Thread(new Woman("woman"+i, shower)).start();
        }
        System.out.println("hello world");
    }

}



class Shower{
    private Semaphore male;
    private Semaphore female;
    public  Shower(int noOfShowers, int capacity){
        //每个淋浴间最多可以同时容纳两个人
        male = new Semaphore(noOfShowers*capacity);
        female = new Semaphore((noOfShowers*capacity));
    }
    public void  userShower(Person person) throws InterruptedException {
        Semaphore semaphore = person.getGender().equals("man")?male: female;
        boolean b = semaphore.tryAcquire(10, TimeUnit.SECONDS);
        if(!b){
            System.out.println("error");
            return;
        }
        System.out.println(person.name+person.getGender()+" take shower start");
        Thread.sleep(10);
        semaphore.release();
        System.out.println(person.name+person.getGender()+" take shower end");
    }
}

abstract class Person implements Runnable{
    protected final String name;
    private  Shower shower;
    public Person(String name, Shower shower){
        this.name = name;
        this.shower = shower;
    }
    public abstract String getGender();
    @Override
    public void run(){
        try {
            shower.userShower(this);
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}

class Man extends Person{

    public Man(String name, Shower shower) {
        super(name, shower);
    }

    @Override
    public String getGender() {
        return "man";
    }
}

class Woman extends Person{

    public Woman(String name, Shower shower) {
        super(name, shower);
    }

    @Override
    public String getGender() {
        return "woman";
    }
}