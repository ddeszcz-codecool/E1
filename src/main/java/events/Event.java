package events;

import employees.Helper;
import employees.Organizer;
import util.Display;

import java.util.List;

public class Event {
    private List<Helper> numberHelperNeeded;
    private List<Organizer> numberOrganizersNeeded;
    private Organizer chiefOrganizer;

    public Event(List<Helper> numberHelpersNeeded, List<Organizer> numberOrganizersNeeded, Organizer chiefOrganizer) {
        if (numberHelpersNeeded.size()<=10){
            Display.notEnoughHelpers();
        }else {
            this.numberHelperNeeded = numberHelpersNeeded;
        }

        if (numberOrganizersNeeded.size()<=10){
            Display.notEnoughOrganisers();
        }else {
            this.numberOrganizersNeeded = numberOrganizersNeeded;
        }

        this.chiefOrganizer = chiefOrganizer;
    }

    public void eventStart(){
        Display.startMessage();
    }

    public List<Helper> getNumberHelperNeeded() {
        return numberHelperNeeded;
    }

    public void setNumberHelperNeeded(List<Helper> numberHelperNeeded) {
        this.numberHelperNeeded = numberHelperNeeded;
    }

    public List<Organizer> getNumberOrganizersNeeded() {
        return numberOrganizersNeeded;
    }

    public void setNumberOrganizersNeeded(List<Organizer> numberOrganizersNeeded) {
        this.numberOrganizersNeeded = numberOrganizersNeeded;
    }

    public Organizer getChiefOrganizer() {
        return chiefOrganizer;
    }

    public void setChiefOrganizer(Organizer chiefOrganizer) {
        this.chiefOrganizer = chiefOrganizer;
    }
}
