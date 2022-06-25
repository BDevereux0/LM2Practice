import com.example.java.*;
import com.example.java.Animal;
import com.example.java.Aircraft;
import collectionsPractice.Student;

public class Main {

    public static void main(String[] args) {
        Animal a1 = new Animal("dog", "Zoey", 9, true);
        Animal a2 = new Animal("cat", "Zoey", 9, true);
        System.out.println(a1.getType());
        System.out.println(a2.getType());
        Dog d1 = new Dog("dog", "Abby", 9, true);
        d1.setAge(10);
        System.out.println(d1.getAge());
        Animal d2 = new Dog("dog", "Abby", 9, true);
        System.out.println(d2);
        Dog d3 = (Dog) d2;
        d3.test();
        d2.setAge(1000);
        System.out.println(d2);
        System.out.println(d3);

        for (int i=0; i<50; i++){  //gives visual line break
            System.out.print("-");
            if (i == 49){
                System.out.print("\n");
            }
        }

        //above = polymorphism practice. below = interface practice
        Vehicle v1 = new Vehicle("Car", "Chevy", 2);
        displayVehicle(v1);
        Vehicle v2 = new Car("Car", "Ford123", 4);
        displayVehicle(v2);

        Car c1 = (Car) v2;
        displayVehicle(c1);

        Transport t1 = new Car("Car", "GM", 4);
        System.out.println(t1.getTotalDoors());
        Aircraft air1 = new Aircraft("Cessna", "Fixed");
        displayVehicle(air1);
        Transport air2 = new Aircraft("bomber", "fixed");
        displayVehicle(air2);
        changeType(air2);
        displayVehicle(air2);
        changeType(c1);
        displayVehicle(c1);

        c1.newMethod();

        for (int i=0; i<50; i++){  //gives visual line break
            System.out.print("-");
            if (i == 49){
                System.out.print("\n");
            }
        }

        Student s1 = new Student("Joe", 12, 3.5);
        Student s2 = new Student("Bob", 12, 3.5);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        int result = s1.compareTo(s2);

        if (result < 0){
            System.out.println(s1.getName() + " dcomes before " + s2.getName());
        }else if (result > 0){
            System.out.println(s2.getName() + " comes before " + s1.getName());
        }else{
            System.out.println(s1.getName() + " is equal to " + s2.getName());
        }

        int nameCompareResult = s1.compareTo1(s2);

        if (nameCompareResult < 0){
            System.out.println(s1.getName() + " dcomes before " + s2.getName());
        }else if (nameCompareResult > 0){
            System.out.println(s2.getName() + " comes before " + s1.getName());
        }else{
            System.out.println(s1.getName() + " is equal to " + s2.getName());
        }

    }

    private static void displayVehicle(Transport transport){
        String display = transport.getClass().getSimpleName() +
                " {type='" + transport.getType() + '\'' +
                ", make='" + transport.getMake() + '\'' +
                ", totalDoors=" + transport.getTotalDoors() +
                '}';

        System.out.println(display);
    }

    public static void changeType(Transport transport){
            transport.setType("Fighter");
            System.out.println("Holy Camole");
    }


}
