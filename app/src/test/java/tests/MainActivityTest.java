package tests;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

import android.view.View;
import android.widget.TextView;

import com.example.helloworld.MainActivity;
import com.example.helloworld.R;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testStudentNameIsDisplayed() {
        ActivityScenario scenario = rule.getScenario();
        scenario.onActivity(activity -> {
            TextView name_text = activity.findViewById(R.id.name);
            assertEquals(View.INVISIBLE, name_text.getVisibility());
            assertEquals("Yu-Shu Chen", name_text.getText());
        });
    }
}
