public class Task2 {

    static int staticVar;      // Class variable (static)

    int instanceVar;           // Instance variable

    public void method() {
        int localVar;          // Local variable

        // Uncommenting the next line will cause a compile-time error becuase the local variable was not initialized :
        // System.out.println("Local variable: " + localVar);

        // But instance and static variables have default values:
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        obj.method();
    }
}
