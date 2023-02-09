package lesson6;

public class PolishHen extends Hen{
    String country = "Польша";
    @Override
    public int getCountOfEggsPerMonth(){
        return 8000;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Моя країна " + country +  ".Я несу " + getCountOfEggsPerMonth() + " яєць в місяць.";
    }
}
