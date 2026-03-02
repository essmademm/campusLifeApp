package campuslife;
import java.util.ArrayList;
public class CampusLifeApp {

    public static void main(String[] args) {


//        course pl = new course("PL", "Miss.Azhar", 6);
//        course turkish = new course("Turkish", "mizz.Elnura", 4);
//        course english = new course("English", "Ms.Murrey", 3);
//
//        ArrayList<course> courses = new ArrayList<>();
//        courses.add(pl);
//
//        courses.add(turkish);
//        courses.add(english);
//
//
//        ArrayList<AssignmentTask> tasks = new ArrayList<>();
//        tasks.add(new AssignmentTask("Lab 1", pl, 3, 1));
//        tasks.add(new AssignmentTask("lab 2", pl, 4, 4));
//        tasks.add(new AssignmentTask("homework", turkish, 2, 2));
//        tasks.add(new AssignmentTask("project",turkish, 6, 4));
//        tasks.add(new AssignmentTask("esay", english, 3, 0));
//
//
//        ArrayList<StudySession> sessions = new ArrayList<>();
//        sessions.add(new StudySession(pl, 120));
//
//        sessions.add(new StudySession(pl, 110));
//        sessions.add(new StudySession(turkish, 90));
//        sessions.add(new StudySession(english, 100));
//
//
//        System.out.println("corses");
//        for (course c : courses) {
//            System.out.println(c);
//        }
//
//
//        System.out.println("\nassigment");
//        for (AssignmentTask t : tasks) {
//            if (t.isUrgent()) {
//                System.out.println("URGENT: " + t);
//            } else {
//                System.out.println(t);
//            }
//        }
//
//        int remainingHours = 0;
//        for (AssignmentTask t : tasks) {
//            if (!t.isCompleted()) {
//                remainingHours += t.getHours();
//            }
//        }
//        System.out.println("\nRemaining est hours: " + remainingHours);
//
//
//        System.out.println("\nStudy time perCourse");
//        for (course c : courses) {
//            double total = 0;
//            for (StudySession s : sessions) {
//                if (s.getCourse() == c) {
//                    total += s.hours();
//                }
//            }
//            System.out.println(c.getName() + ": " + total + " hours");
//        }
//
//        tasks.get(0).markCompleted();
//        System.out.println("\ncompleted task:");
//        System.out.println(tasks.get(0));
//
//
//        remainingHours = 0;
//        for (AssignmentTask t : tasks) {
//            if (!t.isCompleted()) {
//                remainingHours += t.getHours();
//            }
//        }
//        System.out.println("New remaining hours: " + remainingHours);
        ArrayList<PlanItem> items = new ArrayList<>();

        items.add(new Assignment("OOP 2", 1, 3));
        items.add(new Assignment("Math Hw", 3, 2));
        items.add(new ExamPreparation("OOP midexam", 5, 6));
        items.add(new ClubEvent("programing club meeting", 2, 1));

        System.out.println(" plan Items");
        for (PlanItem item : items) {
            if (item.isUrgent()) {
                System.out.println("urgent: " + item);
            } else {
                System.out.println(item);
            }
        }

        int totalHours = 0;
        for (PlanItem item : items) {
            if (!item.isCompleted()) {
                totalHours += item.getEstimatedHours();
            }
        }
        System.out.println("\ntotal remaining hours: " + totalHours);


        items.get(0).markCompleted();
        System.out.println("\nfter completing one item:");
        System.out.println(items.get(0));

        PlanItem mostUrgent = null;
        for (PlanItem item : items) {
            if (item.isUrgent()) {
                mostUrgent = item;
                break;
            }
        }

        if (mostUrgent != null) {
            System.out.println("\nMost urgent item: " + mostUrgent);
        } else {
            System.out.println("\nno urgent items.");
        }
    }

    }

