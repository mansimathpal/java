package mainclass1;

class Vehicle
{
    int max_speed = 210;
    public void showmaxspeed()
    {
        System.out.println("The top speed is " + max_speed);
    }
}

class Car extends Vehicle
{
    int max_speed = 180;
    public void showmaxspeed_vehicle()
    {
        System.out.println("The top speed of Car is " + max_speed);
        System.out.println("The top speed of Vehicle is " + super.max_speed);
    }
}
 class MainClass1 {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        Car b = new Car();
        b.showmaxspeed_vehicle();
    }
 }
