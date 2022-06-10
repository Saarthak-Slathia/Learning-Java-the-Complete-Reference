package p2;

class OtherPackage {
    OtherPackage(){
        com.learnjava.p1.Protection p = new com.learnjava.p1.Protection();
        System.out.println("OtherPackage constructor");

        System.out.println("n_pub = " + p.n_pub);
    }
}
