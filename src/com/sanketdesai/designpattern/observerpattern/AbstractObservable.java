package com.sanketdesai.designpattern.observerpattern;

import com.sanketdesai.designpattern.observerpattern.changemanager.Event;
import com.sanketdesai.designpattern.observerpattern.changemanager.EventManager;

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

    private EventManager eventManager = EventManager.getInstance();;

    public EventManager getEventManager()
    {
        if(eventManager == null)
        {
            eventManager = EventManager.getInstance();
        }
        return eventManager;
    }

    public void notifyObservers(Event.EVENT event)
    {
        for(Observer o : getEventManager().getEventListeners(event))
        {
            o.update(this);
        }
    }
    public void notifyObservers()
    {
        this.notifyObservers(Event.EVENT.DEFAULT_EVENT);
    }
}
