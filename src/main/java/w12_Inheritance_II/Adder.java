package w12_Inheritance_II;

// A class named Adder that inherits from a superclass named Arithmetic.
/* The parameter(s) and return type of an overridden method must be exactly the same
as those of the method inherited from the supertype. */
class Adder extends Arithmetic {
    @Override
    int add(int x, int y){
        return Math.addExact(x, y);
    }
}
