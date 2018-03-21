package lab.codeclan.climbingroutes;

import java.io.Serializable;

/**
 * Created by user on 20/03/2018.
 */

public class Climb implements Serializable {

    private String name;
    private String grade;
    private boolean climbed;

    public Climb(String name, String grade, boolean climbed) {
        this.name = name;
        this.grade = grade;
        this.climbed = climbed;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public boolean beenClimbed() {
        return climbed;
    }
}
