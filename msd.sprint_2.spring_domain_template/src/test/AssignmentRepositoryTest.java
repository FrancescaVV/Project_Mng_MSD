import org.app.domain.Assignment;

public class AssignmentRepositoryTest {
    @Inject
    private AssignmentRepository assignmentRepository;

    @Test
    public void createInvalidAssignment(){
        Assignment assignment = new Assignment (id=null)
        assignmentRepository.create(assignment);
    }
}