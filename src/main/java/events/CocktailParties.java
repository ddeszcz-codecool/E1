package events;

import employees.Helper;
import employees.Organizer;
import util.Display;
import util.Input;

import java.util.List;

public class CocktailParties extends Event{

    private int numberOfCocktailsAvailable;

    public CocktailParties(List<Helper> numberHelpersNeeded, List<Organizer> numberOrganizersNeeded, Organizer chiefOrganizer) {
        super(numberHelpersNeeded, numberOrganizersNeeded, chiefOrganizer);
    }

    @Override
    public void eventStart() {
        howManyDrinksWillBeAvailable();
        super.eventStart();
    }

    public int howManyDrinksWillBeAvailable(){
        Display.howManyDrinksMessage();
        this.numberOfCocktailsAvailable = Input.numberOfCocktailsAvailable();
        return numberOfCocktailsAvailable;
    }
}
