package lab.codeclan.climbingroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ClimbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climb_item);

        Intent intent = getIntent();
        Climb selectedClimb = (Climb) intent.getSerializableExtra("climb");
        Log.d("ClimbActivity", selectedClimb.getName());
    }
}
