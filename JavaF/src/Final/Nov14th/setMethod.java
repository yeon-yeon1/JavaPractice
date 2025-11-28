package Final.Nov14th;

public class setMethod {
    public static void main(String[] args) {
        A6 a =new A6();
        a.setName("박자바");
        System.out.printf("%s",a.getName());
    }
}
class A6{
    private String name ;
    public void setName(String name) {
        this.name=name;}
    public String getName() {
        return name; }
}
