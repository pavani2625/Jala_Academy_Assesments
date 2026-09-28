class Program10_InterfaceAccessFields {

    public interface PublicInterface {

        int publicNumber = 100;
    }

    protected interface ProtectedInterface {

        int protectedNumber = 200;
    }

    private interface PrivateInterface {

        int privateNumber = 300;
    }

    public static void main(String[] args) {

        System.out.println("Public field: "
                + PublicInterface.publicNumber);

        System.out.println("Protected field: "
                + ProtectedInterface.protectedNumber);

        System.out.println("Private field: "
                + PrivateInterface.privateNumber);
    }
}