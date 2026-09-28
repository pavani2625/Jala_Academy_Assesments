package package1;

public class SamePackage {

    public void accessProtectedMembers() {

        ProtectedParent object = new ProtectedParent();

        System.out.println("Same package number: " + object.number);
        System.out.println("Same package name: " + object.name);

        object.display();
    }
}