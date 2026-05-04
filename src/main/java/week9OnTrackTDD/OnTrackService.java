package week9OnTrackTDD;

public class OnTrackService {

    /**
     * Handles task submission for the OnTrack platform.
     * @param studentId Unique ID of the student
     * @param taskId Unique ID of the task being submitted
     * @param comment A short note for the tutor
     * @return Status string indicating success or failure
     */
    public String submit(String studentId, String taskId, String comment) {
        // TDD Green Phase: Minimum logic required to make the test pass
        if (studentId != null && !studentId.isEmpty()) {
            return "Success";
        }
        return "Fail";
    }
}