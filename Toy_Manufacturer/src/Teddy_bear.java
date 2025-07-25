public class Teddy_bear extends Cuddle_toys  {
    String sound = "growling noise";
    public void settersize(String size) {
        this.size = size;
    }

}

 class Engine_Driver extends  Teddy_bear{

   public void setter() {
  color = "blue";
  job = "Engine driver";
   }

     public void show() {
         System.out.println("size :" + size );
         System.out.println("color :" + color );
         System.out.println("job :" + job);
     }

     public void job() {
         System.out.println("i am a" + job);
     }
     public void sound() {
         System.out.println("my sound is " + sound);
     }
 }

 class gardener extends  Teddy_bear{
    public void setter(){
        color = "red";
        job = "gardener";
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
