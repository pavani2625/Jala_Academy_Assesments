package package2;

import package1.ProtectedParent;

public class DifferentPackage {

    public void tryToAccessProtectedMembers() {

        ProtectedParent object = new ProtectedParent();

        System.out.println(
            "Non-child class in different package cannot directly access protected members."
        );
    }
}