package com.session3;

import com.session4.AccessModifierDemo;

public class Learner {
    String name;
    int regNo;
    String designation;

    public void attendClasses(String name) {
        System.out.println(name + "is attending classes");
    }

    public void doAssignment(String name) {
        System.out.println(AccessModifierDemo.aFloat);
        System.out.println(name + "completed the assignment");
    }

    public void submitFeedback(String name) {
        System.out.println(name + "submitted the feedback");
    }
}
