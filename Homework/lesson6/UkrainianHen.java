package lesson6;

public class UkrainianHen extends Hen{
    String country = "Україна";
    @Override
    public int getCountOfEggsPerMonth() {
        return 10000;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Моя країна " + country +  ".Я несу " + getCountOfEggsPerMonth() + " яєць в місяць.";
    }
}
