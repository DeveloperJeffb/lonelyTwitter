package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by baglinit on 9/19/18.
 */

public class DomesticDuck extends Animal implements FlyingBehaviour{
    @Override
    public void swim(){
        Log.d("shaiful", "yeah dude it can swim");
    }

    public void fly(){
        Log.d("shaiful","I only fly when i am forced to fly");
    }

}
