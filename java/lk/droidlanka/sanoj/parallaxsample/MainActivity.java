package lk.droidlanka.sanoj.parallaxsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private ParallaxView mParallaxView;
    private ParallaxView mParallaxView2;
    private ParallaxView mParallaxView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mParallaxView = (ParallaxView) findViewById(R.id.parallax_view);
        mParallaxView2 = (ParallaxView) findViewById(R.id.parallax_view_2);
        mParallaxView3 = (ParallaxView) findViewById(R.id.parallax_view_3);

        initParallaxViews();
    }

    private void initParallaxViews(){
        mParallaxView.init();
        mParallaxView.setMinimumMovedPixelsToUpdate(ParallaxView.DEFAULT_MIN_MOVED_PIXELS * 1);
        mParallaxView.setMovementMultiplier(ParallaxView.DEFAULT_MOVEMENT_MULTIPLIER * 1);
        mParallaxView.registerSensorListener(ParallaxView.SensorDelay.FASTEST);
        mParallaxView2.init();
        mParallaxView2.setMinimumMovedPixelsToUpdate(ParallaxView.DEFAULT_MIN_MOVED_PIXELS * 2);
        mParallaxView2.setMovementMultiplier(ParallaxView.DEFAULT_MOVEMENT_MULTIPLIER * 2);
        mParallaxView2.registerSensorListener(ParallaxView.SensorDelay.FASTEST);
        mParallaxView3.init();
        mParallaxView3.setMinimumMovedPixelsToUpdate(ParallaxView.DEFAULT_MIN_MOVED_PIXELS * 7);
        mParallaxView3.setMovementMultiplier(ParallaxView.DEFAULT_MOVEMENT_MULTIPLIER * 7);
        mParallaxView3.registerSensorListener(ParallaxView.SensorDelay.FASTEST);
    }

    @Override
    protected void onResume() {
        mParallaxView.registerSensorListener();
        mParallaxView2.registerSensorListener();
        mParallaxView3.registerSensorListener();
        super.onResume();
    }

    @Override
    protected void onPause() {
        mParallaxView.unregisterSensorListener();
        mParallaxView2.unregisterSensorListener();
        //mParallaxView3.unregisterSensorListener();
        super.onPause();
    }

}
