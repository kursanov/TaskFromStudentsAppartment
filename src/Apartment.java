public class Apartment {



    private String title;

    private  int price;

    private  String address;

    public Apartment(){};

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void methodPay(Student [] students){

        int res = setPrice(30000) / students.length;
        System.out.println("Ар бир бала ай сайын "+res + "сом толойт.");
    }



    @Override
    public String toString() {
        return "Apartment{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }
}
