package ENTITIES;

public class User extends Base{
    private long id;
    private String name;
    private String surname;
    private String username;
    private SPID spid;

    public User (){

    }
    public User(long id, String name, String surname, String username){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SPID getSpid() {
        return spid;
    }

    public void setSpid(SPID spid) {
        this.spid = spid;
    }

}




