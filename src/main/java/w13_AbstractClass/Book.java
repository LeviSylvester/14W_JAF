package w13_AbstractClass;

//Write Book class here
abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}
