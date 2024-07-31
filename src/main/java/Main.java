import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

        //Объявляем гонку
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            //Вводим название автомобиля
            System.out.println("- Введите название автомобиля № " + (i+1) + ":");
            String name = scanner.next();

            //Вводим скорость автомобиля
            int speed;
            do{
                System.out.println("- Введите скорость автомобиля № " + (i+1) + ":");
                speed = scanner.nextInt();
                if (speed > 250 || speed < 0){
                    System.out.println("- Неправильная скорость. Требуется значение от 0 до 250.");
                }
            }while (speed > 250 || speed < 0);

            //Определяем текущего лидера
            race.leaderDefining(new Car(name, speed));
        }

        System.out.println("- Самая быстрая машина: " + race.getLeader());
    }
}

