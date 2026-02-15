class AdditionExample {

    // Static Variable (Class Variable)
    static int staticNumber = 100;

    // Non-Static Variable (Instance Variable)
    int nonStaticNumber = 200;

    // Static Method
    static int addStatic(int a, int b) {
        return a + b;
    }

    // Non-Static Method
    int addNonStatic(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Accessing Static Variable (No object needed)
        System.out.println("Static Variable: " + staticNumber);

        // Calling Static Method (No object needed)
        int result1 = addStatic(10, 20);
        System.out.println("Static Method Result: " + result1);

        // Creating Object
        AdditionExample obj = new AdditionExample();

        // Accessing Non-Static Variable (Object needed)
        System.out.println("Non-Static Variable: " + obj.nonStaticNumber);

        // Calling Non-Static Method (Object needed)
        int result2 = obj.addNonStatic(30, 40);
        System.out.println("Non-Static Method Result: " + result2);
    }
}