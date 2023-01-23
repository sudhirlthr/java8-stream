package pojo;

import java.util.Objects;

public class Address {
    private String houseNumber;
    private String locality;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber.equals(address.houseNumber) && locality.equals(address.locality) && pincode.equals(address.pincode) && district.equals(address.district) && state.equals(address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, locality, pincode, district, state);
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber + '\'' +
                ", locality='" + locality + '\'' +
                ", pincode=" + pincode +
                ", district='" + district + '\'' +
                ", state=" + state +
                '}';
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    private String pincode;
    private String district;
    private State state;

    public Address(String houseNumber, String locality, String pincode, String district, State state) {
        this.houseNumber = houseNumber;
        this.locality = locality;
        this.pincode = pincode;
        this.district = district;
        this.state = state;
    }
}
