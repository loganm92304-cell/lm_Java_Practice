class A {
    protected void f() {}
}

class B extends A {
    void f() {} // Compilation Error
}