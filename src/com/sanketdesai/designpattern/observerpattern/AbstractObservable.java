package com.sanketdesai.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by administrator on 9/3/17.
 * Every code writter here is a devotion to My GURU MR. Rajesh Patkar
 */
public abstract class AbstractObservable implements Observable {

    private String name;

    public AbstractObservable(String name)
    {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    List<Observer> observersList = new ArrayList<Observer>();

    public void notifyObservers()
    {

        for(Observer o : observersList)
        {
            o.update(this);
        }
    }
}
