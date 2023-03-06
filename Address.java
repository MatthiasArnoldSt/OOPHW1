public class Address{
    String road;
    String district;
    String state;

    public Address(String road, String district, String state){
        this.road = road;
        this.district = district;
        this.state = state;
    }

    public String getRoad(){
        return road;
    }

    public String getDistrict(){
        return district;
    }

    public String getState(){
        return state;
    }
}
