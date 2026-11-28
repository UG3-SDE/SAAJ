import java.time.LocalDateTime;
import java.util.Objects;

public class Group {

    private Long id;
    private String courseTopic;
    private LocalDateTime meetingDateTime;
    private String location;
    private int maxCapacity;
    private Long organizerId;
    private Long clubId;

    
    public Group(
            String courseTopic,
            LocalDateTime meetingDateTime,
            String location,
            int maxCapacity,
            Long organizerId,
            Long clubId) {

    
    }

}
