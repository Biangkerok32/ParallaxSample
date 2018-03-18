# ParallaxSample
Simple Parallax Image View Sample


Download More Layout

https://www.dropbox.com/sh/ade5mbz1xpc2rqu/-LGtTD139b


How to Add extra ParallaxView 

Res/layout/activity_main.xml

add This code

 <lk.droidlanka.sanoj.parallaxsample.ParallaxView
            android:id="@+id/parallax_view4"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_gravity="center"
            android:background="@drawable/backk" />



MainActivity.java 

private ParallaxView mParallaxView4;

mParallaxView3 = (ParallaxView) findViewById(R.id.parallax_view_4);

private void initParallaxViews(){
        mParallaxView4.init();
        mParallaxView4.setMinimumMovedPixelsToUpdate(ParallaxView.DEFAULT_MIN_MOVED_PIXELS * 1);
        mParallaxView.4setMovementMultiplier(ParallaxView.DEFAULT_MOVEMENT_MULTIPLIER * 1);
        mParallaxView4.registerSensorListener(ParallaxView.SensorDelay.FASTEST);
  
    }



Change Move MOVED PIXELS

mParallaxView4.setMinimumMovedPixelsToUpdate(ParallaxView.DEFAULT_MIN_MOVED_PIXELS * 1);
mParallaxView.4setMovementMultiplier(ParallaxView.DEFAULT_MOVEMENT_MULTIPLIER * 1);


