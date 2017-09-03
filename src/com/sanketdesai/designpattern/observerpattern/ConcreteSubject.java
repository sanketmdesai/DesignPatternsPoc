package com.sanketdesai.designpattern.observerpattern;

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
    public void attach(Observer observer) {
        observersList.add(observer);
        System.out.println(getName() + " : observer added successfully");
    }

    @Override
    public void detach(Observer oBserver) {
        observersList.remove(oBserver);
        System.out.println(getName() + " : observer REMOVED successfully...");
    }
}
