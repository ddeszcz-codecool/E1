package events;

public class Event {
    private int numberHelpersNeeded;
    private int numberOrganizersNeeded;
    private String chiefOrganizer;

    public Event(int numberHelpersNeeded, int numberOrganizersNeeded, String chiefOrganizer) {
        if (numberHelpersNeeded<=10){

        }
        this.numberHelpersNeeded = numberHelpersNeeded;
        this.numberOrganizersNeeded = numberOrganizersNeeded;
        this.chiefOrganizer = chiefOrganizer;
    }
}
