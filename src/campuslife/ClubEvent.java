package campuslife;

public class ClubEvent extends PlanItem {

    public ClubEvent(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    // Club events are not urgent in the same way
    public boolean isUrgent() {
        return false;
    }

    public String getType() {
        return "Club Event";
    }
}