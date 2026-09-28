package package2;

import package1.ProtectedParent;

public class ProtectedChild extends ProtectedParent {

    public void accessProtectedMembers() {

        System.out.println("Child class number: " + number);
        System.out.println("Child class name: " + name);

        display();
    }
}