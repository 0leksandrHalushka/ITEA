package lesson9;

public class City {

    private String cityName;
    private CityInfo cityInfo;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private class CityInfo {

        private String street;
        private String avenue;
        private String square;

        public CityInfo(String street, String avenue, String square) {
            this.street = street;
            this.avenue = avenue;
            this.square = square;
        }

        public String getStreet() {
            return street;
        }

        public String getAvenue() {
            return avenue;
        }

        public String getSquare() {
            return square;
        }

    }

    public CityInfo info (String street){
        return cityInfo =  new CityInfo(street, "No info", "No info");
    }

    public CityInfo info (String street, String avenue){
        return cityInfo =  new CityInfo(street, avenue, "No info");
    }

    public CityInfo info (String street, String avenue, String square){
        return cityInfo =  new CityInfo(street, avenue, square);
    }


    @Override
    public String toString() {
        return "City {" +
                "city Name ='" + cityName + '\'' +
                ", city Info = " +
                 ", street : "+ cityInfo.getStreet() +
                ", avenue : " + cityInfo.getAvenue() +
                ", square : " + cityInfo.getSquare() +
                '}';

    }
}
