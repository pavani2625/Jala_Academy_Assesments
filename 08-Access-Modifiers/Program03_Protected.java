import package1.SamePackage;
import package2.ProtectedChild;
import package2.DifferentPackage;

public class Program03_Protected {

    public static void main(String[] args) {

        System.out.println("Access from same package:");

        SamePackage samePackage = new SamePackage();
        samePackage.accessProtectedMembers();

        System.out.println("\nAccess from child class in different package:");

        ProtectedChild child = new ProtectedChild();
        child.accessProtectedMembers();

        System.out.println("\nAccess from non-child class in different package:");

        DifferentPackage differentPackage = new DifferentPackage();
        differentPackage.tryToAccessProtectedMembers();
    }
}