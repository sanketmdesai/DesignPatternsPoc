package com.sanketdesai.designpattern;

import com.sanketdesai.designpattern.observerpattern.ConcreteObserver;
import com.sanketdesai.designpattern.observerpattern.ConcreteSubject;

/**
 *
 * Each and every code here is written as a devotion to my GURU MR. Rajesh Patkar
 *
 */

public class Main {

    public static void main(String args[]){
        System.out.println("The program has started ");
        testPubSub();
        System.out.println("The main thread of program has ended ");


    }

    public static void testPubSub()
    {
        ConcreteSubject subject1 = new ConcreteSubject("s1");
        ConcreteSubject subject2 = new ConcreteSubject("s2");

        ConcreteObserver observer1 = new ConcreteObserver("observer1");
        ConcreteObserver observer2 = new ConcreteObserver("observer2");
        ConcreteObserver observer3 = new ConcreteObserver("observer3");
        ConcreteObserver observer4 = new ConcreteObserver("observer4");

        subject1.attach(observer1);
        subject1.attach(observer2);
        subject1.attach(observer3);
        subject2.attach(observer1);
        subject2.attach(observer2);
        subject2.attach(observer3);
        subject2.attach(observer4);

        print("first notification to all observers");

        subject1.notifyObservers();
        subject2.notifyObservers();

        print("Removing observers");
        subject1.detach(observer3);
        subject2.detach(observer1);
        subject2.detach(observer2);


        print("2nd notification after removing the observers");
        subject1.notifyObservers();
        subject2.notifyObservers();

    }

    public static void print(String str)
    {
        System.out.println("***************************************************************************");
        System.out.println(str);
        System.out.println("***************************************************************************");
    }

}
