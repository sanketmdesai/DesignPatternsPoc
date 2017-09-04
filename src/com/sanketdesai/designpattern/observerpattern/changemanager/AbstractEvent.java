package com.sanketdesai.designpattern.observerpattern.changemanager;

/**
 * Created by administrator on 9/3/17.
 * Every code writter here is a devotion to My GURU MR. Rajesh Patkar
 */
public class AbstractEvent extends Event {
    private String name;

    public AbstractEvent(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
