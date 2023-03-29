//A. Nurul Aisya Alda 13020210263
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Centra0263 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0302 obj = new Central0302 ();
        System.out.println("main");
        obj.aaa();
    }
}