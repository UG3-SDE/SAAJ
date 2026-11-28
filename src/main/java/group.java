import java.time.LocalDateTime;
import java.util.Objects;

public class Group {

    private Long id;
    private String courseTopic;
    private LocalDateTime meetingDateTime;
    private String venue;
    private int maxCapacity;
    private Long organizerId;
    private Long clubId;
    private GroupStatus status;

    
    public Group(
            String courseTopic,
            LocalDateTime meetingDateTime,
            String venue,
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

    public String getVenue() {
        return venue;
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

    
    // SETTERS

     public void setId(Long id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException(
                    "Group ID must be positive");
        }

        this.id = id;
    }

    public void setCourseTopic(String courseTopic) {
        if (courseTopic == null || courseTopic.isBlank()) {
            throw new IllegalArgumentException(
                    "Course topic cannot be empty");
        }

        this.courseTopic = courseTopic;
    }

    public void setMeetingDateTime(LocalDateTime meetingDateTime) {
        this.meetingDateTime = Objects.requireNonNull(
                meetingDateTime, "Meeting date and time cannot be null");
    }

    public void setLocation(String venue) {
        if (venue == null || venue.isBlank()) {
            throw new IllegalArgumentException(
                    "Venue cannot be empty");
        }

        this.venue = venue;
    }

    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity <= 0) {
            throw new IllegalArgumentException(
                    "Maximum capacity must be greater than zero");
        }

        this.maxCapacity = maxCapacity;
    }


    // BUSINESS LOGIC
    // -- TO DO --
}
