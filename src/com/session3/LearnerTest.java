package com.session3;

public class LearnerTest {
    public static void main(String[] args) {
        Learner learner1 = new Learner();
        setFields(learner1, "Vishal", 12323, "Software Engineer");
        callMethods(learner1);
        Learner learner2 = new Learner();
        setFields(learner2, "Mohan", 232243, "Engineer");
        System.out.println("-------------");
        callMethods(learner2);
    }

    private static void callMethods(Learner learner1) {
        learner1.doAssignment(learner1.name);
        learner1.attendClasses(learner1.name);
        learner1.submitFeedback(learner1.name);
        System.out.println(learner1.designation);
        System.out.println(learner1.name);
        System.out.println(learner1.regNo);
    }

    private static void setFields(Learner learner1, String vishal, int i, String s) {
        learner1.name = vishal;
        learner1.regNo = i;
        learner1.designation = s;
    }


}
