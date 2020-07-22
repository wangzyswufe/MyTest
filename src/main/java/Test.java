import java.io.RandomAccessFile;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello!");
        try {
            RandomAccessFile in = new RandomAccessFile("qq", "rw");
        }
        catch (Exception e){

        }

    }
}
