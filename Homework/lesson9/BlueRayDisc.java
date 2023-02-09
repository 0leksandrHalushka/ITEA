package lesson9;

public class BlueRayDisc {

    private String disc;
    private DiscInfo discInfo;


    public BlueRayDisc(String disc) {
        this.disc = disc;
    }


    private class DiscInfo{
        String catalogName;
        String subdirectories;
        String note;

        public DiscInfo(String catalogName, String subdirectory, String note) {
            this.catalogName = catalogName;
            this.subdirectories = subdirectory;
            this.note = note;

        }

        public String getCatalogName() {
            return catalogName;
        }

        public String getSubdirectories() {
            return subdirectories;
        }

        public String getNote() {
            return note;
        }
    }

    public DiscInfo recordInfo (String catalogue, String subcategory, String note){
        return discInfo = new DiscInfo(catalogue, subcategory, note);
    }


    @Override
    public String toString() {
        return "BlueRayDisc {" +
                "disc: ' " + disc + '\'' +
                ", discInfo:" + discInfo.getCatalogName() +
                "/" + discInfo.getSubdirectories() +
                "/" + discInfo.getNote() +
                '}';
    }
}
