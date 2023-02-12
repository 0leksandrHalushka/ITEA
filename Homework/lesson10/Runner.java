package lesson10;

@Repeat

//@Repeat(repeating = 2,
//        repeatingText = "Hello!")

public  class Runner implements Running {

    @Override
    public void run() {
        Class<Runner> runnerClass = Runner.class;
        Repeat repeat = runnerClass.getAnnotation(Repeat.class);

        for (int i = 0; i < repeat.repeating(); i++) {
            System.out.println(repeat.repeatingText());
        }
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run();
    }
}

