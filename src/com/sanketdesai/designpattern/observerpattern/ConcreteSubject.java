package com.sanketdesai.designpattern.observerpattern;

import com.sanketdesai.designpattern.observerpattern.changemanager.Event;

/**
 * Created by administrator on 9/3/17.
 * Every code writter here is a devotion to My GURU MR. Rajesh Patkar
 */
public class ConcreteSubject extends AbstractObservable {


    public ConcreteSubject(String name)
    {
        super(name);
    }
    @Override
    public void attach(AbstractObserver observer) {
        getEventManager().register(Event.EVENT.DEFAULT_EVENT,observer);
        System.out.println(getName() + " : observer added successfully");
    }

    @Override
    public void detach(AbstractObserver oBserver) {
        getEventManager().unregister(Event.EVENT.DEFAULT_EVENT,oBserver);
        System.out.println(getName() + " : observer REMOVED successfully...");
    }


    public void addEvent1Handler(AbstractObserver abstractObserver){
        getEventManager().register(Event.EVENT.EVENT_ONE,abstractObserver);
    }
}
