package lab.codeclan.climbingroutes;

import java.util.ArrayList;

/**
 * Created by user on 20/03/2018.
 */

public class FavouriteClimbRoutes {
    private ArrayList<Climb> routeList;

    public FavouriteClimbRoutes() {
        this.routeList = new ArrayList<>();
        routeList.add(new Climb("Bricks", "6a+", true));
        routeList.add(new Climb("Slabby", "7", false));
        routeList.add(new Climb("Ladder", "4+", true));
        routeList.add(new Climb("Where are the holds?", "E7", false));
        routeList.add(new Climb("Umphh", "6c", true));
        routeList.add(new Climb("Eeek", "8a", false));
    }



    public ArrayList<Climb> getRouteList() {
        return new ArrayList<Climb>(this.routeList);
        //return this.routeList;
    }
}
