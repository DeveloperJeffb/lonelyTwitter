package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

/**
 * Created by baglinit on 9/19/18.
 */

public class Duck extends Animal implements FlyingBehaviour{

    @Override
    public void swim(){
        Log.d("shaiful", "yeah dude person dude  I like to swag");
    }
    public void fly(){
        Log.d("shaiful", "I Love flying");
    }

}
