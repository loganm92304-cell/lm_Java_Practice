class A {}

class B extends A {}

class Parent {
    A getObj() {
        return new A();
    }
}

class Child extends Parent {
    @Override
    B getObj() {
        return new B();
    }
}