package campuslife;

public class AssignmentTask {
    private String title;
    private course course;
    private int hours;
    private int dayUntilDue;
    private boolean completed;

    public AssignmentTask(String title, course course, int hours , int daysUntilDue) {
        this.title = title;
        this.course = course;
        this.hours = hours;
        this.dayUntilDue = daysUntilDue;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public course getCourse() {
        return course;
    }

    public int getHours() {
        return hours;
    }

    public int getDayUntilDue() {
        return dayUntilDue;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    public boolean isUrgent() {
        return dayUntilDue <= 2 && !completed;
    }

    public String toString() {
        return "asignmentTask '" + title + "', course='" + course.getName() +
                "', estHours=" + hours + ", dueIn=" + dayUntilDue +
                ", completed=" + completed + "}";
    }
}