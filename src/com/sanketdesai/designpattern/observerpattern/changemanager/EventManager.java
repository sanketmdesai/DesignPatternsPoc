package com.sanketdesai.designpattern.observerpattern.changemanager;

import com.sanketdesai.designpattern.observerpattern.AbstractObserver;
import com.sanketdesai.designpattern.observerpattern.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by administrator on 9/3/17.
 * Every code writter here is a devotion to My GURU MR. Rajesh Patkar
 */
public class EventManager {
//    private Map<Event,List<Observer>> eventMap = new HashMap();
    private Map<Event.EVENT,List<AbstractObserver>> eventMap = new HashMap();

    private static EventManager eventManager;

    // private constructor....
    private EventManager()
    {

    }

    public static EventManager getInstance()
    {
        if(eventManager == null)
        {
            eventManager = new EventManager();
        }
        return eventManager;
    }


    public void register(Event.EVENT eventName , AbstractObserver observer)
    {
        if(eventMap.get(eventName) == null)
        {
            eventMap.put(eventName,new ArrayList<AbstractObserver>());
        }
        eventMap.get(eventName).add(observer);
        System.out.println("Observer registered successfully");
    }

    public void unregister(Event.EVENT event , AbstractObserver observer)
    {
        if(eventMap.get(event) == null)
        {
            eventMap.put(event,new ArrayList<AbstractObserver>());
        }
//        eventMap.get(event).add(observer);
        System.out.println("Observer UN - registered successfully");
    }

    public List<AbstractObserver> getEventListeners(Event.EVENT event)
    {
        return eventMap.get(event);
    }
}
