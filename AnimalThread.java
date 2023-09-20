class AnimalThread extends Thread {
    private final String name;
    private int distance;

    public AnimalThread(String name, int priority) {
        this.name = name;
        setPriority(priority);
    }

    public void run() {
        while (distance < 100) {
            distance += 10;
            System.out.println(name + " преодолел " + distance + " метров.");

            // Временная задержка, чтобы имитировать передвижение
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " финишировал!");
    }
}

