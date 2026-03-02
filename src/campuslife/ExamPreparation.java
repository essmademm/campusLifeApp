package campuslife;

public class ExamPreparation extends PlanItem {

    public ExamPreparation(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    // Exams are urgent earlier
    public boolean isUrgent() {
        return daysUntil <= 5 && !completed;
    }

    public String getType() {
        return "Exam Prep";
    }
}
