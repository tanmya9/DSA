interface Machine
{
    String start();
}

abstract class Appliance implements Machine{ //doesn't need to implement the start method coz it's an abstract class
    String name;
    Appliance(String name) //to represent the type of appliance
    {
        this.name=name;
    }
}

class Fan extends Appliance
{
    Fan(String name)
    {
        super(name);
    }
    public String start()
    {
        return "Fan is running";
    }
}

class WashingMachine extends Appliance
{
    WashingMachine(String name)
    {
        super(name);
    }
    public String start()
    {
        return "Washing Machine is operating";
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Machine fan=new Fan("Fan");
        Machine washer=new WashingMachine("Washing Machine");
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}
    
