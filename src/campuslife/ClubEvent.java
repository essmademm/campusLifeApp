package campuslife;

public class ClubEvent extends PlanItem {

    public ClubEvent(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }


    public boolean isUrgent() {
        return false;
    }

    public String getType() {
        return "Club Event";
    }
}