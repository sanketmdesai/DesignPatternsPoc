package com.sanketdesai.designpattern.observerpattern;

/**
 * Created by administrator on 9/3/17.
 * Every code writter here is a devotion to My GURU MR. Rajesh Patkar
 */
public class ConcreteObserver extends AbstractObserver{


    public ConcreteObserver(String name){
        super(name);
    }

    public void update(AbstractObservable subject)
    {
        System.out.println(getName() + ": Observer was updated from the subject "+subject.getName());
    }

}
