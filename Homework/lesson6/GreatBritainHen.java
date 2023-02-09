package lesson6;

public class GreatBritainHen extends Hen{
    String country = "Велика Британія";
    @Override
    public int getCountOfEggsPerMonth() {
        return 12000;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Моя країна " + country +  ".Я несу " + getCountOfEggsPerMonth() + " яєць в місяць.";
    }
}
