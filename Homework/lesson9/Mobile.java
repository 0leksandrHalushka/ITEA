package lesson9;

public class Mobile {

    private String model;
    private Properties properties;


    public void setModel(String model) {
        this.model = model;
    }

    private class Properties {

        private double screenDiagonal;
        private String screenType;
        private int price;
        private int ram;
        private int rom;

        private Properties(double screenDiagonal, String screenType, int price, int ram, int rom) {
            this.screenDiagonal = screenDiagonal;
            this.screenType = screenType;
            this.price = price;
            this.ram = ram;
            this.rom = rom;

        }

        public double getScreenDiagonal() {
            return screenDiagonal;
        }

        public String getScreenType() {
            return screenType;
        }

        public int getPrice() {
            return price;
        }

        public int getRam() {
            return ram;
        }

        public int getRom() {
            return rom;
        }

    }

    public Properties info(int price, int ram, int rom, double screenDiagonal, String screenType) {
        return properties = new Properties(screenDiagonal, screenType, price, ram, rom);
    }

    @Override
    public String toString() {
        return "Mobile {" +
                "model='" + model + '\'' +
                ", Properties = " + " Screen type : " + properties.getScreenType() +
                " | Screen diagonal : " + properties.getScreenDiagonal() +
                " | RAM : " + properties.getRam() +
                " GB | ROM : " + properties.getRom() +
                " GB | Price : " + properties.getPrice() +
                '}';
    }


}
