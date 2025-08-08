package Fig2;

public interface Employee {
    void doWork();
    
    public class Designer implements Employee {
        public void doWork() {
            System.out.println("Designing game interfaces...");
        }
    }


    public class Artist implements Employee {
        public void doWork() {
            System.out.println("Creating character and environment art...");
        }
    }
    
    public class Programmer implements Employee {
        public void doWork() {
            System.out.println("Writing and debugging code...");
        }
    }
    public class Tester implements Employee {
        public void doWork() {
            System.out.println("Testing software for bugs...");
        }
    }


}


