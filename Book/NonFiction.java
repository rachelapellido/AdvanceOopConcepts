public class NonFiction extends Book{

    public NonFiction(String BookTitle) {
        super(BookTitle);
        setPrice();
    }

    @Override
    void setPrice() {
        BookPrice= 37.99;
    }
}
