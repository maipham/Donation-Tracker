package edu.gatech.donationtracker.model;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.firebase.firestore.DocumentReference;

/**
 * Item that is being stored in inventories
 */
public class Item implements Comparable<Item>, Parcelable {

    private String uri;
    private String name;
    private String id;
    private String category;
    private int quantity;
    private Locations location;
    DocumentReference reference;

    /** constructor **/
    public Item(String uri, String name, String id, String category, int quantity, Locations location) {
        this.uri = uri;
        this.name = name;
        this.id = id;
        this.category = category;
        this.quantity = quantity;
        this.location = location;
    }

    /** default constructor **/
    public Item() {
        this("Enter uri", "Enter name: ", "Enter id: ", "Enter category: ", 0, null);
    }

    protected Item(Parcel in) {
        uri = in.readString();
        name = in.readString();
        id = in.readString();
        category = in.readString();
        quantity = in.readInt();
    }

    /** creator method for Parcel **/
    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    /** compareTo method */
    public int compareTo (Item item) {
        return this.id.compareTo(item.id);
    }

    /**
     * add the quantity of an item that is already in the inventory
     *
     * @param quantity the # of items to be added
     */
    public void addQuantity (int quantity) {
        this.quantity += quantity;
    }

    /**
     * remove the quantity of an item that is already in the inventory
     *
     * @param quantity the # of items to be added
     */
    public void removeQuantity (int quantity) {
        this.quantity -= quantity;
    }

    /** getter/setter */
    public int getQuantity() {
        return quantity;
    }

    /** toString of this object */
    @Override
    public String toString() {
        return uri + " - " + category + " - " + " id: " + id + " - " + name + " x" + quantity;
    }

    /** getter/setter */
    public String getUri() {
        return uri;
    }

    /** getter/setter */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /** getter/setter */
    public String getName() {
        return name;
    }

    /** getter/setter */
    public void setName(String name) {
        this.name = name;
    }

    /** getter/setter */
    public String getId() {
        return id;
    }

    /** getter/setter */
    public void setId(String id) {
        this.id = id;
    }

    /** getter/setter */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /** getter/setter */
    public String getCategory() {
        return category;
    }

    /** getter/setter */
    public void setCategory(String category) {
        this.category = category;
    }

    /** getter/setter */
    public DocumentReference getReference() {
        return reference;
    }

    /** getter/setter */
    public void setReference(DocumentReference reference) {
        this.reference = reference;
    }

    /** getter/setter */
    public Locations getLocation() {
        return location;
    }

    /** getter/setter */
    public void setLocation(Locations location) {
        this.location = location;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uri);
        dest.writeString(name);
        dest.writeString(id);
        dest.writeString(category);
        dest.writeInt(quantity);
    }
}
