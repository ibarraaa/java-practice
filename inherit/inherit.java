class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Beep");
    }
}


class Car extends Vehicle{
    private String modelName = "Mustang";
}