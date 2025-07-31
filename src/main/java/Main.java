import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for(int i=0; i<3; i++){
            String carName = "";
            int carSpeed = -1;
            while(carName.isEmpty()){
                System.out.println("Введите марку автомобиля №" + (i+1));
                carName = scanner.nextLine();
                if(carName.isEmpty()){
                    System.out.println("Марка автомобиля не может быть пустой \n");
                }
            }
            while(carSpeed<0 || carSpeed > 250){
                System.out.println("Введите скорость автомобиля №" + (i+1) + " в диапазоне от 0 до 250");
                try{
                    carSpeed = scanner.nextInt();
                } catch (Exception e) {
                    scanner.nextLine();
                }

                if(carSpeed < 0 || carSpeed > 250) {
                        System.out.println("Наверная скорость автомобиля\n");
                }

            }
            Car car = new Car(carName, carSpeed);
            cars.add(car);
        }
        Race megaRace = new Race();
        for(Car car: cars){
            megaRace.setLeader(car.name, car.speed);
        }

        System.out.println("Самая быстрая машина: " + megaRace.getLeader() );
    }
}
