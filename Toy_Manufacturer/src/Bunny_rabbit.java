public class Bunny_rabbit extends Cuddle_toys {
     String sound = "squeak";
    public void settersize(String size) {
        this.size = size;
    }
    }

class clown extends Bunny_rabbit{
public void setter() {
    size = "medium";
    color = "white";
    job = "clown";
}
    public void show() {
        System.out.println("size :" + size );
        System.out.println("color :" + color );
        System.out.println("job :" + job);
    }

    public void job() {
        System.out.println("i am " + job);
    }
    public void sound() {
        System.out.println("sound is " + sound);
    }
}






class Bank_Manager extends  Bunny_rabbit{
    public void setter() {
        size = "medium";
        color = "black";
        job = "bank manager";
    }
    public void show() {
        System.out.println("size :" + size );
        System.out.println("color :" + color );
        System.out.println("job :" + job);
    }

    public void job() {
        System.out.println("i am " + job);
    }
    public void sound() {
        System.out.println("sound is " + sound);
    }
}
