package edu.gatech.donationtracker.model;

public class LocationEmployee extends User {

    /** the location this employee belongs to */
    private Locations location;
    private boolean hasLocation;

    /** constructor */
    public LocationEmployee(String email, String username, String password, Locations location) {
        super(email, username, password);
        this.location = location;
        this.hasLocation = location != null;
    }

    /**
     * add data of the location this employee belongs to
     *
     * @param items all items being added
     */
    public void addData(Item... items) {
        if (hasLocation) {
            location.removeData(items);
        }
    }

    /**
     * remove data of the location this employee belongs to
     *
     * @param items all items being removed
     */
    public void removeData(Item... items){
        if (hasLocation) {
            location.removeData(items);
        }
    }

    /** getters and setters */
    public Locations getlocation() {
        return location;
    }
    public void setlocation(Locations location) {
        this.location = location;
    }
    public boolean HasLocation() {
        return hasLocation;
    }
    public void setHasLocation(boolean hasLocation) {
        this.hasLocation = hasLocation;
    }
}
