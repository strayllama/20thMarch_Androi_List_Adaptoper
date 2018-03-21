package lab.codeclan.climbingroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FavouriteClimbRoutes favClimbs = new FavouriteClimbRoutes();
        ArrayList<Climb> routeList = favClimbs.getRouteList();

        FavClimbsAdaptor favClimbsAdaptor = new FavClimbsAdaptor(this, routeList);


        ListView listView = findViewById(R.id.climbList);
        listView.setAdapter(favClimbsAdaptor);
    }

    public void onListClickItem(View listItem) {
        Climb selectedClimb = (Climb) listItem.getTag();

        Log.d("MainActivity", selectedClimb.getName());


        Intent intent = new Intent(this, ClimbActivity.class);
        intent.putExtra("climb", selectedClimb);

        startActivity(intent);

    }


}
