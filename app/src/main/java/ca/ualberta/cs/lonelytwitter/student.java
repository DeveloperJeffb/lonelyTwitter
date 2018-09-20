package ca.ualberta.cs.lonelytwitter;

/**
 * Created by baglinit on 9/19/18.
 */

public class student {
    public String name;
    public int age;
    //member variables to be called in the main function


    public student(String name, int age){
        this.name=name;
        this.age=age;
    }

     public student(String name){
         this.name=name;
     }

    public void setName(String name){
        this.name=name; //this refers to current object
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;

    }
}
