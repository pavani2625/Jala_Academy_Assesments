package package2;

import package1.PublicParent;

public class DifferentPackagePublic {

    public void accessPublicMembers() {

        PublicParent object = new PublicParent();

        System.out.println("Number: " + object.number);
        System.out.println("Name: " + object.name);

        object.display();
    }
}