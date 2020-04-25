package fruits;

public class Box<T extends WeightProvider> implements WeightProvider{
   private T content;

   public Box(T content){
       this.content=content;
   }
   public T getContent(){
       return content;
   }


    @Override
    public int getWeight() {
        return content.getWeight() +1;
    }
}
