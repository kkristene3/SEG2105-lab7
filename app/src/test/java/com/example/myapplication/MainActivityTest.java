package com.example.myapplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import android.widget.Button;
import android.widget.TextView;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);;
    private MainActivity mActivity = null;
    private TextView text;
    private Button button;

    @Before
    public void setUp() throws Exception {
        mActivityTestRule.getScenario().onActivity(activity -> {
            this.mActivity = activity;
        });
    }

    @Test
    public void checkFirstName() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.first_name));
        text = mActivity.findViewById(R.id.first_name);
        text.setText("first");
        String name = text.getText().toString();
        assertNotEquals("user", name);
    }

    @Test
    public void checkLastName() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.last_name));
        text = mActivity.findViewById(R.id.last_name);
        text.setText("last");
        String name = text.getText().toString();
        assertEquals("last", name);
    }

    @Test
    public void checkEmailID() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.email));
        text = mActivity.findViewById(R.id.email);
        text.setText("email");
        String name = text.getText().toString();
        assertEquals("email", name);
    }

    @Test
    public void checkPassword() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.password));
        text = mActivity.findViewById(R.id.password);
        text.setText("password");
        String name = text.getText().toString();
        assertEquals("password", name);

    }

    @Test
    public void checkSubmitButton() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.submit_btn));
        button = mActivity.findViewById(R.id.submit_btn);
        button.performClick();


        text.setText("submit");
        String name = text.getText().toString();
        assertEquals("submit", name);
    }

    @Test
    public void checkMessage() throws Exception {
        assertNotNull(mActivity.findViewById(R.id.message));
        text = mActivity.findViewById(R.id.message);
        text.setText("message");
        String name = text.getText().toString();
        assertEquals("message", name);
    }
}
