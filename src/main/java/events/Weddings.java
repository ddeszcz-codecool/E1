package events;

import employees.Helper;
import employees.Organizer;
import util.Display;

import java.util.List;

public class Weddings extends Event {
    private boolean weddingCakeReady;

    public Weddings(List<Helper> numberHelpersNeeded, List<Organizer> numberOrganizersNeeded, Organizer chiefOrganizer, boolean weddingCakeReady) {
        super(numberHelpersNeeded, numberOrganizersNeeded, chiefOrganizer);
        if (weddingCakeReady) {
            Display.noCakeNoWedding();
        } else {
            this.weddingCakeReady = weddingCakeReady;
        }
    }



}
