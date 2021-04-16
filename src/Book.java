public class Book  {

    private String bookName;
    private String writer;

    public Book (String bookName ,String writer)
    {
        this.bookName = bookName;
        this.writer = writer;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    @Override
    public String toString() {
        return " Название книги : " + bookName +
                " , Писатель : '" + writer + '\'';
    }
}
