/*   class Car {
        String color;
        String brand;
        int speed;
        int fuel;
        public Car(String brand, String color, int fuel) {
            this.brand = brand;
            this.color = color;
            this.fuel = fuel;
            this.speed = 0;
        }
        public void accelerate() {
            if (fuel > 0) {
                speed += 10;
                fuel -= 5;
                System.out.println(brand + " accelerated. Speed: " + speed + " km/h | Fuel: " + fuel + "%");
            } else {
                System.out.println(brand + " is out of fuel! Cannot accelerate.");
            }
        }
        public void decelerate() {
            if (speed > 0) {
                speed -= 10;
                System.out.println(brand + " slowed down. Speed: " + speed + " km/h");
            } else {
                System.out.println(brand + " is already stopped.");
            }
        }
       public void refill() {
            fuel += 20;
            System.out.println(brand + " refueled. Current Fuel: " + fuel + "%");
        }
        public void showFuel() {
            System.out.println("Fuel Status for " + color + " " + brand + ": " + fuel + "%");
        }
    }
    public class Day6{
        public static void main(String[] args) {

            Car myCar = new Car("Tesla", "Red", 30);
            myCar.showFuel();
            myCar.accelerate();
            myCar.accelerate();
            myCar.decelerate();
            myCar.refill();
            myCar.showFuel();

       
 */
public class student {
                                                                                                                                                                     String name;
    int regNo;
    String dept;
    int maths, physics, cs;


    student(String name, int regNo, String dept, int maths, int physics, int cs) {
        this.name = name;
        this.regNo = regNo;
        this.dept = dept;
        this.maths = maths;
        this.physics = physics;
        this.cs = cs;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Register No: " + regNo);
        System.out.println("Department: " + dept);
        System.out.println("Maths Mark: " + maths);
        System.out.println("Physics Mark: " + physics);
        System.out.println("CS Mark: " + cs);

        int total = maths + physics + cs;
        System.out.println("Total Marks: " + total);
    }

    public static void main(String[] args) {
        student s1 = new student("Subasree SJ", 12345, "B.Sc Statistics", 90, 85, 95);
        s1.display();
    }
}























