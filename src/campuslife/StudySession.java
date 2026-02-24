package campuslife;

public class StudySession {

    private course course;
    private int minutes;

    public StudySession(course course, int minutes) {
        this.course = course;
        this.minutes = minutes;
    }

    public course getCourse() {
        return course;
    }

    public int getMinutes() {
        return minutes;
    }

    public double hours() {
        return minutes / 60.0;
    }

    public String toString() {
        return "StudySession" + course.getName() + "', minutes=" + minutes + "}";
    }
}
