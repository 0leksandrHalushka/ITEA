package lesson15;

public class Runner {

    public static void main(String[] args) {

        LoadUnloadTrain threadLoad = new LoadUnloadTrain();
        threadLoad.start();

    }
}
