package ENTITIES;

import java.util.Date;

public class Base {
    private long id;
    private Date createdAt;
    private Date createdBy;

    public Base() {
    }

    public Base(long id, Date createdAt, Date createdBy) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedBy(){
        return this.createdBy;
    }

    public void setCreatedBy(){
        this.createdBy = createdBy;
    }
}