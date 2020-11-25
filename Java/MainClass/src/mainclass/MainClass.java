package mainclass;

class Vehicle
{
    int max_speed = 210;
    Vehicle(int max_speed)
    {
       // max_speed = max_speed;
        this.max_speed = max_speed;
    }
    public void showmaxspeed()
    {
        System.out.println("The top speed is" + max_speed);
    }
}
 class MainClass {
    public static void main(String[] args) {
        Vehicle a = new Vehicle(250);
        a.showmaxspeed();
    }
}
