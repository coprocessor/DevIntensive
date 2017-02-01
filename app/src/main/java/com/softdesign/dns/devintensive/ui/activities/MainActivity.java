package com.softdesign.dns.devintensive.ui.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softdesign.dns.devintensive.R;
import com.softdesign.dns.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";
//    private static final String TAG = ConstantManager.TAG_PREFIX + " " + MainActivity.class.getSimpleName(); ///

    protected EditText mEditText;
//    protected Button mBtnVisible, mBtnInVisible; ///
    protected Button mRedButton, mGreenButton;
//    private String mVisibleMode; ///
    private int mColorMode;
//    private int mActivityCount = 0; ///

    /**
     * Method is called when creating the activity (after a configuration change or return to the
     * current activity after its destruction.
     * This method is initialized (made is):
     * -UI user interface (statics)
     * -initialization of static data activity
     * -data connection with lists (initialize adapters)
     * Warning: do Not start long-running operations to work with data in onCreate()!
     * @param savedInstanceState -- the object with the values stored in the Bundle
     *                           -- the state of the UI.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        mRedButton = (Button) findViewById(R.id.red_btn);
        mGreenButton = (Button) findViewById(R.id.green_btn);
        mEditText = (EditText) findViewById(R.id.edit_text);

        mRedButton.setOnClickListener(this);
        mGreenButton.setOnClickListener(this);

        if (savedInstanceState == null) {
            // the activity starts for the first time
        } else {
            // activity is already created
            mColorMode = savedInstanceState.getInt(ConstantManager.COLOR_MODE_KEY);

            if(mColorMode == Color.RED) {
                mEditText.setBackgroundColor(Color.RED);
            } else if (mColorMode == Color.GREEN) {
                mEditText.setBackgroundColor(Color.GREEN);
            }
        }
    }

    // TODO if the object is not specified ID, then save system data entered will not happen.

    /**
     * Method is called when starting activity for the time before the UI becomes available to the
     * user. Usually in this method registers event subscriptions stop which was made in onStop().
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**
     * Method is invoked when the 'activity' is available to the user for interaction. In this
     * method, as a rule, run animations, audio/video, your BroadCastReceiver is run -- necessary
     * for the implementation of the UI logic (start of thread execution, etc.). The method should
     * be as "lightweight" -- to increase productivity (adequate responsiveness) UI.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * Method is invoked when the current 'activity' loses focus but remains visible to the user
     * (the ascent of the dialog box, partial overlapping of the different 'activity', etc. In this
     * method, implement the preservation of "lightweight" UI data/animations/audio/video, etc.)
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    // TODO here is the save data (attributes, position, etc.) to Bundle

    /**
     * Method is invoked when the 'activity' becomes invisible to the user. In this method occurs
     * unsubscribing from events that stop the "heavy" animations, complex operations for saving
     * data, interrupting running threads, etc.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * Method is called at the end of the 'activity' -- when this happens systemically or after
     * calling the method finish().
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * Method is called when the restart 'activity' -- resume after a call to onStop () method.
     * This method implements the specific business logic that should be implemented, namely, when
     * the restart 'activity'. Example: server request, which must be called on the return from
     * another 'activity' (data updates, subscription to a particular event initialized on another
     * screen (specific business logic "tied", on restart 'activity').
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.red_btn:
                mEditText.setBackgroundColor(Color.RED);
                mColorMode = Color.RED;
                break;

            case R.id.green_btn:
                mEditText.setBackgroundColor(Color.GREEN);
                mColorMode = Color.GREEN;
                break;

        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d(TAG, "onSaveInstanceState()");
        outState.putInt(ConstantManager.COLOR_MODE_KEY, mColorMode);
    }
}
