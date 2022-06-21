package ENTITIES;
public class SPID extends Base{
    private long id;
    private User user;
    Status status = Status.PENDING;
    private String description;

    public SPID(long id, User user, Status status, String description) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}