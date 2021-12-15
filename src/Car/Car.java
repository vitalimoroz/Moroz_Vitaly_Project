package Car;

/*
Закрепить материал по классам и объектам.
Создать проект в идее, в нем создать класс Car (цвет, марка, пробег, автомат или нет).


В этом классе сделать конструктор со всеми параметрами.
В классе Car должны быть след методы по взаимодействию:
печатать всю инфу, увеличить пробег на заданную величину.
*/

class Car {
    String carColor;
    String carMark;
    int carMileAge;
    boolean carGearBoxAutomatic;

    Car(String carColor, String carMarc, int carMileAge, boolean carGearBoxAutomatic) {
        this.carColor = carColor;
        this.carMark = carMarc;
        this.carMileAge = carMileAge;
        this.carGearBoxAutomatic = carGearBoxAutomatic;
    }

    void showInfo() {
        System.out.println("Color: " + this.carColor);
        System.out.println("Mark: " + this.carMark);
        System.out.println("MileAge: " + this.carMileAge);
        System.out.println("Automatic Gear Box: " + this.carGearBoxAutomatic);
        System.out.println("-------------------------------");
    }

    void increaseMileAge(int carMileAge) {
        this.carMileAge += carMileAge;
    }
}

/*
Создать класс Person (имя, возраст, национальность, есть права или нет, авто).
Создать конструктор с параметрами (имя, возраст, нац, права).
Методы класса Person: напечетать всю инфу,
метод принимает принимет авто и проверяет есть ли права у человека,
если есть - назначает ему это авто.
*/

class Person {
    String name;
    int age;
    String nationality;
    boolean driverLicense;
    Car car;

    Person(String name, int age, String nationality, boolean driverLicense, Car car) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.driverLicense = driverLicense;
        this.car = car;
    }

    void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Nationality: " + this.nationality);
        System.out.println("Driver's License: " + this.driverLicense);
        if (this.car != null) {System.out.println("Car: " + car.carMark);}
        else System.out.println("No Car");
        System.out.println("-------------------------------");

    }

    void setAuto(Car car) {
        if (this.driverLicense) {
            this.car = car;
        }
    }
}

/*
Для тестирования - созд новый класс Test, в нем - psvm.
И там поупражняться в создании объектов,
вызове методов, взаимодействии объектов.
*/

class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        Car ford = new Car("red","ford", 100,true);
        ford.showInfo();
        ford.increaseMileAge(100);
        ford.showInfo();

        Person johnDoe = new Person ("john", 20, "UK",true, null);
        johnDoe.showInfo();
        johnDoe.setAuto(ford);
        johnDoe.showInfo();

    }

}