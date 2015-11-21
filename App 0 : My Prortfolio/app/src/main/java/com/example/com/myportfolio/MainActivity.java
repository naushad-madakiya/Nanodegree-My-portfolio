package com.example.com.myportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyClick(View view) {
        Button button = (Button) view;

        switch (button.getId()) {
            case R.id.button_spotify:
                makeToast(createToastMessage(button.getText().toString()));
                break;
            case R.id.button_scores_app:
                makeToast(createToastMessage(button.getText().toString()));
                break;
            case R.id.button_library_app:
                makeToast(createToastMessage(button.getText().toString()));
                break;
            case R.id.button_build_it_bigger:
                makeToast(createToastMessage(button.getText().toString()));
                break;
            case R.id.button_xyz_reader:
                makeToast(createToastMessage(button.getText().toString()));
                break;
            case R.id.button_capstone:
                makeToast(createToastMessage(button.getText().toString()));
                break;

        }
    }

    /**
     * this method is used to create perticular toast message to display
     *
     * @param string to concat with toast prefix
     * @return toast_prefix + string
     */
    private String createToastMessage(String string) {
        return getString(R.string.toast_prefix) + string;
    }

    /**
     * this is common method to show toast message from main activity
     *
     * @param message
     */
    private void makeToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
