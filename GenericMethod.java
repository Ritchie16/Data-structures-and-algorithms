class Utils{
     public static <T> void printItem(T item){
        System.out.println("Item: " + item);

    }

}


public class GenericMethod {
       public static void main(String[] args) {
        Utils.printItem(1);
        Utils.printItem("Ritchie");
    }
}
