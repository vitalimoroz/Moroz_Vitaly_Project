package Employee;

import java.util.Random;

/*
Создать класс Employee (int id, String name, double salary, double rate).
Все поля приватные. Конструктор сделать со всеми параметрами.
Сделать метод, который будет возвращать зп = ставка(salary) * rate.
 */
public class Employee {
    int id;
    String name;
    double salary;
    double rate;

    public Employee(int id, String name, double salary, double rate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
    }

    public Employee() {

    }

    double zpCalc(Employee Emp) {
        return this.salary * this.rate;
    }
}

/*
Cоздать класс Developer, кот будет наследоваться от Employee. У девелопера помимо всего прочего есть кол-во строк кода (int codeLines).
для девелопера зп высчитывается по другой формуле: зп = ставка(salary) * rate * codeLinew/random число от 100 до 1000.
*/

class Developer extends Employee {
    int id;
    String name;
    double salary;
    double rate;
    int codeLines;

    Developer(int id, String name, double salary, double rate, int codeLines) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
        this.codeLines = codeLines;
    }

    double zpDeveloperCalc() {
        Random rand = new Random();
        int randomInt = 100 + rand.nextInt(901);
        return this.salary * this.rate * this.codeLines / randomInt;
    }
}

/*
    Создать класс Manager, кот будет наследоваться от Employee. У менеджера помимо всего прочего есть кол-во проектов, на которых он работает (int projectsAmount).
        Для менеджера зп высчитывается по стандартной формуле для сотрудника.
        Создать класс Test, в котором создать менеджера и девелопера. вывести на экран инфо о них (toString) и вывесть зп итоговую для каждого.
*/