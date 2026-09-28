import package1.PublicParent;
import package2.DifferentPackagePublic;

public class Program04_Public {

    public static void main(String[] args) {

        System.out.println("Access from same package:");

        PublicParent object = new PublicParent();

        System.out.println("Number: " + object.number);
        System.out.println("Name: " + object.name);

        object.display();

        System.out.println("\nAccess from different package:");

        DifferentPackagePublic differentPackage =
                new DifferentPackagePublic();

        differentPackage.accessPublicMembers();
    }
}