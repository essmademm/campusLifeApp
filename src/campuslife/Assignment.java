package campuslife;

public class Assignment extends PlanItem {

    public Assignment(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    public boolean isUrgent() {
        return daysUntil <= 2 && !completed;
    }

    public String getType() {
        return "Assignment";
    }
}
