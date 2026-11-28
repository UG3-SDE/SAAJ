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
    private GroupStatus status;

    
    public Group(
            String courseTopic,
            LocalDateTime meetingDateTime,
            String location,
            int maxCapacity,
            Long organizerId,
            Long clubId,
            GroupStatus status) {

        this.organizerId = Objects.requireNonNull(
            organizerId, "Organizer ID cannot be null");

        this.clubId = clubId;
        this.status = GroupStatus.ACTIVE;
    
    }

    public enum GroupStatus {
        ACTIVE,
        CANCELLED
    }

    
    // GETTERS

    public Long getId() {
        return id;
    }

    public String getCourseTopic() {
        return courseTopic;
    }

    public LocalDateTime getMeetingDateTime() {
        return meetingDateTime;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Long getOrganizerId() {
        return organizerId;
    }

    public Long getClubId() {
        return clubId;
    }

    public GroupStatus getStatus() {
        return status;
    }

}
