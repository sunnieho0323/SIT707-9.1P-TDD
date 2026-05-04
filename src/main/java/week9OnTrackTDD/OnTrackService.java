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
	    // Simple validation logic
	    if (studentId == null || !studentId.startsWith("S")) {
	        return "Invalid ID";
	    }
	    if (comment == null || comment.isEmpty()) {
	        return "Comment Required";
	    }
	    return "Success";
	}
}