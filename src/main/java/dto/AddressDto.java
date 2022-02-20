package dto;

public class AddressDto {
    private String city;
    private String provinces;
    private String zip;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "AddressDto{" +
                "city='" + city + '\'' +
                ", provinces='" + provinces + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
