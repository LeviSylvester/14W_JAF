package w15_MethodOverriding2Super;

class MotorCycle extends BiCycle {

    @Override
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());

//        String temp = define_me(); //Fix this line
        String temp = super.define_me();

        // or we could just write super.define_me() here instead of temp
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}
