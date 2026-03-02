package campuslife;

public class PlanItem {

    protected String title;
    protected int daysUntil;
    protected int estimatedHours;
    protected boolean completed;

    public PlanItem(String title, int daysUntil, int estimatedHours) {
        this.title = title;
        this.daysUntil = daysUntil;
        this.estimatedHours = estimatedHours;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public int getDaysUntil() {
        return daysUntil;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    public boolean isUrgent() {
        return daysUntil <= 2 && !completed;
    }


    public String getType() {
        return "Plan Item";
    }

    public String toString() {
        return getType() +
                "{title='" + title +
                "', daysUntil=" + daysUntil +
                ", hours=" + estimatedHours +
                ", completed=" + completed + "}";
    }
}
