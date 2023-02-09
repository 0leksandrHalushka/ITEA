package lesson6;

public class MoldovanHen extends Hen{
    String country = "Молдова";
    @Override
    public int getCountOfEggsPerMonth(){
        return 7000;
    }
    @Override
    public String getDescription(){

        return super.getDescription() +  "Моя країна " + country +  ".Я несу " + getCountOfEggsPerMonth() + " яєць в місяць.";
    }
}
