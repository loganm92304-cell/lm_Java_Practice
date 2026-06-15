class A {
    final static void f() {}
}

class B extends A {
    static void f() {} // Compilation Error
}