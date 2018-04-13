package com.example.user.wargamingrecordsapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Unit implements Parcelable {

    int unitId;
    String unitName;
    static int nextId;

    public Unit(String unitName) {
        unitId = nextId;
        this.unitName = unitName;
        nextId++;
    }

    public Unit(Parcel in) {
        this.unitId = in.readInt();
        this.unitName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(unitId);
        dest.writeString(unitName);
    }

    public static final Parcelable.Creator<Unit> CREATOR = new Parcelable.Creator<Unit>() {

        public Unit createFromParcel(Parcel in) {
            return new Unit(in);
        }

        public Unit[] newArray(int size) {
            return new Unit[size];
        }
    };

    public int getUnitId() {
        return unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Unit) {
            Unit toCompare = (Unit) obj;
            return (this.unitName.equalsIgnoreCase(toCompare.getUnitName()));
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (this.getUnitName()).hashCode();
    }

}
