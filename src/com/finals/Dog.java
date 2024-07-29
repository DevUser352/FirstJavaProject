package com.finals;

public class Dog extends Animal {

    private int walkDistancePreference;

    public int getWalkDistancePreference() {
        return walkDistancePreference;
    }

    public void setWalkDistancePreference(int walkDistancePreference) {
        this.walkDistancePreference = walkDistancePreference;
    }
    public void bark(){
        System.out.println("woof");
    }
//    public void eat(){
//        System.out.println("nom nom nom");
//    }
}
