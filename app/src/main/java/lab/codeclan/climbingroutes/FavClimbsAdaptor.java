package lab.codeclan.climbingroutes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/03/2018.
 */

public class FavClimbsAdaptor extends ArrayAdapter<Climb> {

    public FavClimbsAdaptor(Context context, ArrayList<Climb> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        Climb currentRoute = getItem(position);

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_climb_item, parent, false);
        }
            TextView grade = listItemView.findViewById(R.id.grade);
            grade.setText(currentRoute.getGrade().toString());

            TextView name = listItemView.findViewById(R.id.title);
            name.setText(currentRoute.getName());

            TextView climbed = listItemView.findViewById(R.id.climbed);
            String status = "";
            if (currentRoute.beenClimbed()) {
                status = "Climbed";
            } else {
                status = "Not climbed";
            }
            climbed.setText(status);

            listItemView.setTag(currentRoute);

            return listItemView;
        }

    }