public class Runner {
    public void show(){
        Cuddle_toys p1 = new Cuddle_toys();
        p1.setSize("medium");

        System.out.println("---TEDDY_ENGINE---");
        Teddy_bear t1 = new Teddy_bear();



        Engine_Driver e1 = new Engine_Driver();
        e1.setter();
        e1.show();
        System.out.println("------");
        e1.job();
        System.out.println("------");
        e1.sound();


        System.out.println("---GARDENER---");
        gardener e2 = new gardener();
        e2.setter();
        e2.show();
        System.out.println("---");
        e2.job();
        System.out.println("---");
        e2.sound();

Bunny_rabbit b1 = new Bunny_rabbit();
        System.out.println("---CLOWN---");
        clown q1 = new clown();
        q1.setter();
        q1.show();
        System.out.println("---");
        q1.job();
        System.out.println("---");
        q1.sound();


        System.out.println("---BANK_MANAGER---");
        Bank_Manager q2 = new Bank_Manager();
        q2.setter();
        q2.show();
        System.out.println("---");
        q2.job();
        System.out.println("---");
        q2.sound();
    }
}
