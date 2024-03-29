package Model;

/**
 * A class representing a room.
 *
 * @author Group 8
 * @version 1 - December 2019
 */
public class Room {
    private Equipment equipment;
    private String room;
    /**
     * The constant ROOM_LIST.
     */
    public static final String[] ROOM_LIST = {"A001", "A002", "A003", "A004", "A005", "A101", "A102", "A103", "A104", "A105",
            "A201", "A202", "A203", "A204", "A205", "A301", "A302", "A303", "A304", "A305", "B001", "B002", "B003", "B004", "B005",
            "B101", "B102", "B103", "B104", "B105", "B201", "B202", "B203", "B204", "B205", "B301", "B302", "B303", "B304", "B305",
            "C001", "C002", "C003", "C004", "C005", "C101", "C102", "C103", "C104", "C105", "C201", "C202", "C203", "C204", "C205",
            "C301", "C302", "C303", "C304", "C305"};

    /**
     * Two-argument constructor instantiating a new Room.
     *
     * @param equipment the equipment found in a room
     * @param room      the room number
     */
    public Room(Equipment equipment, String room) {
        this.equipment = equipment;

        boolean illegal = true;
        for (int i = 0; i < ROOM_LIST.length; i++) {
            if (room.equals(ROOM_LIST[i])) {
                this.room = room;
                illegal = false;
                break;
            }
        }
        if (illegal) {
            throw new IllegalArgumentException("Illegal argument for Room!!!!");

        } else {
            System.out.println("success");
        }
    }

    /**
     * Getter for equipment.
     *
     * @return the equipment found in the room
     */
    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * Getter for room.
     *
     * @return the number of the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * Setter for equipment.
     *
     * @param equipment the equipment
     */
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    /**
     * Sets the room if the room number is legal.
     *
     * @param room the room number
     */
    public void setRoom(String room) {
        boolean illegal = true;
        for (int i = 0; i < ROOM_LIST.length; i++) {
            if (room.equals(ROOM_LIST[i])) {
                this.room = room;
                illegal = false;
                break;
            }
            if (illegal) {
                throw new IllegalArgumentException("Illegal argument for room!!!!");

            } else {
                System.out.println("success");
            }
        }
    }
    /**
     * Returning the information about a room.
     * @return a string including information about a room
     */
    public String toString() {
        return room;
    }

    /**
     * Returning if two rooms are the same.
     * @param obj the room compared to
     * @return true if the rooms are identical. Otherwise return false.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Room))
            return false;
        Room other = (Room) obj;
        return equipment.equals(other.equipment) && room.equals(other.room);
    }
}
