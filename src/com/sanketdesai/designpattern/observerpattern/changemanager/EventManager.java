package com.sanketdesai.designpattern.observerpattern.changemanager;

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
    private Map<Event.EVENT,List<Observer>> eventMap = new HashMap();


    public void register(Event.EVENT eventName , Observer observer)
    {
        if(eventMap.get(eventName) == null)
        {
            eventMap.put(eventName,new ArrayList<Observer>());
        }
        eventMap.get(eventName).add(observer);
        System.out.println("Observer registered successfully");
    }

    public void unregister(String event , Observer observer)
    {

    }

}
