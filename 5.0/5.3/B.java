class A {
    void f() {}
}

class B extends A {
    static void f() {} // Compilation Error
}