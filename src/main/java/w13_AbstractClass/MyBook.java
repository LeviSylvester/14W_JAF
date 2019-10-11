package w13_AbstractClass;

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }

    // We only have to rewrite method
    // if it's not implemented in the abstract class (or doesn't work the way we want)
//    @Override
//    String getTitle(){
//        return this.title;
//    }

}
