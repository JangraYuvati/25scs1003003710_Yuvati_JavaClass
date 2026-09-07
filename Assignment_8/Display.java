class Display {

    
    void show(String name) {
        System.out.println("Name: " + name);
    }

    
    void show(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    void show(String name, int age, double marks) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Display d = new Display();

        d.show("Yuvati");

        System.out.println();

        d.show("Yuvati", 19);

        System.out.println();

        d.show("Yuvati", 19, 90.5);
    }
}