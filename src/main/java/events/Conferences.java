package events;

import employees.Helper;
import employees.Organizer;
import util.Display;

import java.util.List;


public class Conferences extends Event{

    private int goodiesBags;
    private int numberOfGuests;


    public Conferences(List<Helper> numberHelpersNeeded, List<Organizer> numberOrganizersNeeded,
                       Organizer chiefOrganizer, int goodiesBags, int numberOfGuests) {
        super(numberHelpersNeeded, numberOrganizersNeeded, chiefOrganizer);
        if (goodiesBags<0){
            Display.cannotBeSmallerThanZero();
        } else {
        this.goodiesBags = goodiesBags;}
        if (numberOfGuests<0){
            Display.cannotBeSmallerThanZero();
        } else {
            this.numberOfGuests = numberOfGuests;
        }
    }

    @Override
    public void eventStart() {
        if(goodiesBags == 0){
            super.eventStart();
        } else if (goodiesBags >= numberOfGuests){
            super.eventStart();
        } else {
            Display.moreGoodiesBagsNeeded();
        }

    }


}
