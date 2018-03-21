package lab.codeclan.climbingroutes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/03/2018.
 */

public class FavClimbsArrayTest {
    private Climb climbA;
    private FavouriteClimbRoutes favouriteClimbRoutes;

    @Before
    public void before() {
        favouriteClimbRoutes = new FavouriteClimbRoutes();
    climbA = new Climb("Walk in the park", "3+", true);
    }

    @Test
    public void getArrayOfClimbsFromFavouriteClimbRoutes() {
//        System.out.println(favouriteClimbRoutes.toString());
    }


}
