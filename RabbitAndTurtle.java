public class RabbitAndTurtle {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Кролик", Thread.MAX_PRIORITY);
        AnimalThread turtle = new AnimalThread("Черепаха", Thread.MIN_PRIORITY);

        // Запуск потоков
        rabbit.start();
        turtle.start();

        // Изменение приоритетов и ожидание завершения потоков
        try {
            Thread.sleep(3000); // Подождать 3 секунды

            // Изменить приоритеты
            rabbit.setPriority(Thread.MIN_PRIORITY);
            turtle.setPriority(Thread.MAX_PRIORITY);

            // Ожидать завершения потоков
            rabbit.join();
            turtle.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Догонялки завершены.");
    }
}
