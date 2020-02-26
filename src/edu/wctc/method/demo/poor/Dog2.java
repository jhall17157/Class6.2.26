package edu.wctc.method.demo.poor;

public class Dog2 {

    private int age;

    public Dog2(int age) {

        this.age = age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    private void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative");
        }

    }
    public void chaseMailCarrier() {
        startRunning();
        closeGapToMailCarrier();
        naviagateToMailCarrier();
    }
    public void closeGapToMailCarrier() {
        System.out.println("CLosing th egap");
    }
    public void startRunning() {
        System.out.println("Starts running");
    }
    public void naviagateToMailCarrier () {
        System.out.println("Idk bruh");
    }
}
