package com.sanketdesai.designpattern.observerpattern;


import com.sanketdesai.designpattern.observerpattern.changemanager.Event;

import java.util.List;

public interface Observable {

     public void attach(AbstractObserver observer);

     public void detach(AbstractObserver observer);

     public void notifyObservers(Event.EVENT event);
}
