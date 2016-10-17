package com.hubz.hubzapp;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.hubz.hubzapp.fragments.ExampleFragment;

public class MainActivity extends FragmentActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    static final String SAVED_DATA = "saved_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        android.os.Debug.startMethodTracing(); blad brak sd card
        setContentView(R.layout.activity_main);

        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
            ExampleFragment firstFragment = new ExampleFragment();

            // In case this activity was started with special instructions from an
            // Intent, pass the Intent's extras to the fragment as arguments
            firstFragment.setArguments(getIntent().getExtras());

            // Add the fragment to the 'fragment_container' FrameLayout
            getFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();  // Always call the superclass method first

    }

    @Override
    public void onDestroy() {
        super.onDestroy();  // Always call the superclass

        // Stop method tracing that the activity started during onCreate()
//        android.os.Debug.stopMethodTracing();
    }

    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putString(SAVED_DATA, EXTRA_MESSAGE);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method first
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        String dane = savedInstanceState.getString(SAVED_DATA);
    }

    @Override
    protected void onStop() {
        super.onStop();  // Always call the superclass method first
        Log.i("TAG", "stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();  // Always call the superclass method first
        // Activity being restarted from stopped state
    }


    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // For the main activity, make sure the app icon in the action bar
            // does not behave as a button
        }
        startActivity(intent);
    }

    public void change
}
