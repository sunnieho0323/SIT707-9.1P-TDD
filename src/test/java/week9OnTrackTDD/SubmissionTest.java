package week9OnTrackTDD;

// Import ONLY Jupiter (JUnit 5) assertions to avoid confusion
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class SubmissionTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "224863464";
		// JUnit 5 syntax: message comes last
		assertNotNull(studentId, "Student ID is null");
	}

	@Test
	public void testStudentName() {
		String studentName = "Sunnie Ho";
		assertNotNull(studentName, "Student name is null");
	} // <-- This closing brace was missing!

	@Test
    public void testSubmitAssignmentWithComment() {
        OnTrackService service = new OnTrackService();
        
        // Scenario: Student submits Task 9.1P with a comment
        String result = service.submit("S224863464", "TASK-9.1P", "Completed TDD and CI implementation.");
        
        // Verify the result is "Success"
        assertEquals("Success", result);
    }
}