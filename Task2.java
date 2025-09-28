public class Task2 {

    static int staticVar;      // Class variable (static)

    int instanceVar;           // Instance variable

    public void method() {
        int localVar;          // Local variable

        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        obj.method();
    }
}
