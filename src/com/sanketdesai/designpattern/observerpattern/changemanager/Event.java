package com.sanketdesai.designpattern.observerpattern.changemanager;

/**
 * Created by administrator on 9/3/17.
 * Every code writter here is a devotion to My GURU MR. Rajesh Patkar
 */
public class Event { // later on stages .... This event should be modled in to a class and there should be a complete class hirarchy.

    public enum EVENT{

        EVENT_ONE ("one"),
        EVENT_TWO ("two"),
        DEFAULT_EVENT("defaultEvent");

        private final String eventName ;

        EVENT(String name)
        {
            this.eventName = name;
        }

        public String getEventName() {
            return eventName;
        }
    }
}