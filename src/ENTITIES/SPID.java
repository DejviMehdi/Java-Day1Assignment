package ENTITIES;

public class SPID {
    private long id;
    private User user;
    private Status status;

    public SPID(long id, User user) {
        this.id = id;
        this.user = user;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}