
class Box1 {
    private String name;

    public void set(String name){
        this.name = name;
    }

    public String get(){
        return name;
    }
}

//resusable- A custom generic class
class Box2<T>{
    private T variable;

    public void set(T variable){
        this.variable = variable;
    }

    public T get(){
        return variable;
    }
}


public class Generics1{
    
    public static void main(String[] args) {
        Box1 mybBox1 = new Box1();

        mybBox1.set("Ritchie");
        System.out.println(mybBox1.get());

        Box2<Integer> mynum1 = new Box2<>();
        mynum1.set(16);

        System.out.println(mynum1.get());
    }
}