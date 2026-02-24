package campuslife;
import java.util.ArrayList;
public class CampusLifeApp {

    public static void main(String[] args) {

        // Courses
        course pl = new course("PL", "Miss.Azhar", 6);
        course turkish = new course("Turkish", "mizz.Elnura", 4);
        course english = new course("English", "Ms.Murrey", 3);

        ArrayList<course> courses = new ArrayList<>();
        courses.add(pl);

        courses.add(turkish);
        courses.add(english);


        ArrayList<AssignmentTask> tasks = new ArrayList<>();
        tasks.add(new AssignmentTask("Lab 1", pl, 3, 1));
        tasks.add(new AssignmentTask("lab 2", pl, 4, 4));
        tasks.add(new AssignmentTask("homework", turkish, 2, 2));
        tasks.add(new AssignmentTask("project",turkish, 6, 4));
        tasks.add(new AssignmentTask("esay", english, 3, 0));


        ArrayList<StudySession> sessions = new ArrayList<>();
        sessions.add(new StudySession(pl, 120));

        sessions.add(new StudySession(pl, 110));
        sessions.add(new StudySession(turkish, 90));
        sessions.add(new StudySession(english, 100));


        System.out.println("corses");
        for (course c : courses) {
            System.out.println(c);
        }


        System.out.println("\nassigment");
        for (AssignmentTask t : tasks) {
            if (t.isUrgent()) {
                System.out.println("URGENT: " + t);
            } else {
                System.out.println(t);
            }
        }

        int remainingHours = 0;
        for (AssignmentTask t : tasks) {
            if (!t.isCompleted()) {
                remainingHours += t.getHours();
            }
        }
        System.out.println("\nRemaining est hours: " + remainingHours);


        System.out.println("\nStudy time perCourse");
        for (course c : courses) {
            double total = 0;
            for (StudySession s : sessions) {
                if (s.getCourse() == c) {
                    total += s.hours();
                }
            }
            System.out.println(c.getName() + ": " + total + " hours");
        }

        tasks.get(0).markCompleted();
        System.out.println("\ncompleted task:");
        System.out.println(tasks.get(0));


        remainingHours = 0;
        for (AssignmentTask t : tasks) {
            if (!t.isCompleted()) {
                remainingHours += t.getHours();
            }
        }
        System.out.println("New remaining hours: " + remainingHours);
    }
}