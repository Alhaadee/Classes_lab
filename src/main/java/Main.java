public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("1","Alan",1000);
//        System.out.println(account1);
//        account1.setName("John");
//        System.out.println(account1.getName());

        Circle circle1 = new Circle(5);


//        System.out.println(circle1.getRadius());
//        circle1.setRadius(10);
//        System.out.println(circle1.getCircumference());
//        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(4,5);
//        System.out.println(rectangle1.getPerimeter());
//        System.out.println(rectangle1.getArea());
//        System.out.println(rectangle1.getDiagonal());
//        System.out.println(rectangle1);


        Customer customer1 = new Customer("john","smith",1000);
        Customer customer2 = new Customer("Alan", "jones", 200);
        Customer customer3 = new Customer("Alhaadee", "rahman", 300);

//        System.out.println(customer1.getFullName());
//        customer1.subtractHeldMoney(500);
//        System.out.println(customer1.getHeldMoney());

        System.out.println(customer1.getId());
        System.out.println(customer2.getId());
        System.out.println(customer3.getId());
        customer2.checkBalance();
        System.out.println(customer1);




    }
}
