package SERVICE;


import ENTITIES.SPID;
import ENTITIES.Status;
import ENTITIES.User;

public class Service {



    public static User createUser(long id, String name, String surname, String username) {
        return new User(id, name, surname, username);
    }


    public static SPID createSpid(long id, User user, Status status, String description) {
        return new SPID(id, user, status, description);
    }

    public static void editUser(User user, long id, String name, String surname, String username) {
        user.setId(id);
        user.setName(name);
        user.setSurname(surname);
        user.setUsername(username);
    }

    public static void editSpid(SPID Spid, long id, User user, Status status, String description) {
        Spid.setId(id);
        Spid.setUser(user);
        Spid.setStatus(status);
        Spid.setDescription(description);
    }

    public static void main(String[] args) {
        User user0 = createUser(0, "Dejvi", "Mehdi", "DejviMehdi");
        SPID Spid0 = createSpid(0, user0, Status.PENDING, "Peter Dejvi's SPID");

        User user1 = createUser(1, "Florian", "Samiti", "Florian1998");
        SPID Spid1 = createSpid(1, user1, Status.PENDING, "Jane Smith's SPID");

        User user2 = createUser(2, "Mike", "Jones", "mjones");
        SPID Spid2 = createSpid(2, user2, Status.PENDING, "Mike Jones's SPID");



        try {
            editUser(user0, 4, "Dejvi", "Mehdi", "DejviMehdi2001");
            editSpid(Spid0, 4, user0, Status.APPROVED, "Dejvi Mehdi's SPID");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        editUser(user1, 5, "Jane", "Smith", "jsmith12");
        editUser(user2, 6, "Mike", "Jones", "mjones12");


        editSpid(Spid1, 5, user1, Status.APPROVED, "Jane Smith's SPID");
        editSpid(Spid2, 6, user2, Status.APPROVED, "Mike Jones's SPID");



        System.out.println("List of SPIDs:\n");
        System.out.println("ID: " + Spid0.getId() + " Status: " + Spid0.getStatus() + " Description: " + Spid0.getDescription());
        System.out.println("ID: " + Spid1.getId() + " Status: " + Spid1.getStatus() + " Description: " + Spid1.getDescription());
        System.out.println("ID: " + Spid2.getId() + " Status: " + Spid2.getStatus() + " Description: " + Spid2.getDescription());


        System.out.println("\nList of SPIDs connected to a user:\n");
        System.out.println("Username: " + user0.getUsername() + " is connected to SPID: " + Spid0.getUser().getUsername().equals(user0.getUsername()));
        System.out.println("Username: " + user1.getUsername() + " is connected to SPID: " + Spid1.getUser().getUsername().equals(user1.getUsername()));
        System.out.println("Username: " + user2.getUsername() + " is connected to SPID: " + Spid2.getUser().getUsername().equals(user2.getUsername()));

    }
}