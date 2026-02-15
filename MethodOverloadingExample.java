class  MethodOverloadingExample   
 {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) 
   {
      MethodOverloadingExample   obj = new  MethodOverloadingExample();

        System.out.println("Addition of 2 Numbers: " + obj.add(10, 20));
        System.out.println("Addition of 3 integers: " + obj.add(10, 20, 30));
        System.out.println("Addition of 2 double values: " + obj.add(10.5, 20.5));
    }
}