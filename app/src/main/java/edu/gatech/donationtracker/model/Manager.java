package edu.gatech.donationtracker.model;

public class Manager extends LocationEmployee{

    /** constructor
     *  managers don't have a location because they can view and alter all locations!
     *  DO NOT CALL LocationEmployee's add or remove method because managers location variable
     *  is always null!
     */
    public Manager(String email, String username, String password) {
        super(email, username, password, null);
    }

//    /**
//     * Extra credit!
//     * Hire a user to be a location employee
//     *
//     * @param model the model of all accounts
//     * @param user the user who would be changed to employee
//     * @param location the location this employee will be assigned to
//     * @return true if the user is type User and the type change is successful, false otherwise
//     */
//    public boolean hireUser(Model model, User user, Locations location) {
//        if (model.remove(user.getEmail())) {
//            model.add(new LocationEmployee(user.getEmail() ,user.getName(), user.getPassword(), location));
//            return true;
//        } else {
//            return false;
//        }
//    }


    /**
     * Add data of any location
     *
     * @param location the location where the data would be changed
     * @param items the items being removed
     */
    public void addData(Locations location, Item... items) {
        location.addData(items);
    }

    /**
     * remove data of any location
     *
     * @param location the location where the data would be change
     * @param items the items being removed
     */
    public void removeData(Locations location, Item... items){
        location.removeData(items);
    }

    /**
     * Extra credit!
     * change a employee's location
     *
     * @param employee the employee whose location would be changed
     * @param location the new location this employee will be assigned to
     */
    public void changeEmployeeLocation(LocationEmployee employee, Locations location) {
        employee.setlocation(location);
    }

}
