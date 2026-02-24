package campuslife;

public class course {
    private String name;
    private String teacher;
    private int credit;

    public course(String name, String instructor, int credits) {
        this.name = name;
        this.teacher = instructor;
        this.credit = credits;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return teacher;
    }

    public int getCredits() {
        return credit;
    }

    public String toString() {
        return "Course:name='" + name + "', instructor='" + teacher + "', credits;" + credit + "}";
    }
}
