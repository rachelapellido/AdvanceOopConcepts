public class Fiction extends Book{

	public Fiction(String BookTitle) {
        super(BookTitle);
        setPrice();
    }

    @Override
    void setPrice() {
        BookPrice= 24.99;
    }
}
