package com.sanketdesai.designpattern.observerpattern;

/**
 * Created by administrator on 9/3/17.
 * Every code writter here is a devotion to My GURU MR. Rajesh Patkar
 */
public abstract class AbstractObserver implements Observer {
    private String name;

    public AbstractObserver(String name)
    {
        this.name = name;
    }


    public String getName(){
        return name;
    }
}
