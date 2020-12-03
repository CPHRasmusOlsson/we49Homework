public class Bog {
    int isbn;
    String titel;
    int udgivelsesår;

    public Bog(int isbn, String titel, int udgivelsesår) {
        this.isbn = isbn;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bog bog = (Bog) o;
        return isbn == bog.isbn;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbn=" + isbn +
                ", titel='" + titel + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                '}';
    }
}
