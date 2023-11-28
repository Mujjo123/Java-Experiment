public class StaticExample {
    // Static variable to count the number of instances
    private static int instanceCount = 0;

    // Instance variable
    private String instanceName;

    // Constructor increments the instance count and assigns a name to the instance
    public StaticExample(String name) {
        instanceCount++;
        this.instanceName = name;
    }

    // Static method to get the current instance count
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Instance method to get the name of the current instance
    public String getInstanceName() {
        return instanceName;
    }

    public static void main(String[] args) {
        // Creating instances of the class
        StaticExample obj1 = new StaticExample("Instance 1");
        StaticExample obj2 = new StaticExample("Instance 2");
        StaticExample obj3 = new StaticExample("Instance 3");

        // Accessing static method to get the instance count
        System.out.println("Number of instances created: " + StaticExample.getInstanceCount());

        // Accessing instance method to get the name of each instance
        System.out.println("Name of instance 1: " + obj1.getInstanceName());
        System.out.println("Name of instance 2: " + obj2.getInstanceName());
        System.out.println("Name of instance 3: " + obj3.getInstanceName());
    }
}
