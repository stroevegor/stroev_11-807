import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Human> list = FrameWork.getObjects(10, Human.class);
        System.out.println(list);
    }
}