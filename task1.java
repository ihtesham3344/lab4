
public class Task1 {

    // Class variable 
    static int classCount = 0;

    // Instance variable 
    int instanceCount;

    // Constructor
    public int Task1() {
        
        instanceCount = classCount;
        return 0;
    }

    // Method to demonstrate local variable
    public void showCounts() {
        int localCount = 10;  // Local variable inside method
        System.out.println("classCount: " + classCount);
        System.out.println("instanceCount: " + instanceCount);
        System.out.println("localCount: " + localCount);
  System.out.println("---------------show count executed successfully-----------");
    }

    public static void main(String[] args) {
        // Create first object
      Task1 obj = new Task1();
        obj.showCounts();

      

        // Create second object
       Task1 obj2 = new Task1();
obj2.instanceCount=1000;
        obj2.showCounts();
    }
}
