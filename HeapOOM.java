import java.util.*;
public class HeapOOM{
    static class OOMObject{
    }
    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
            try {
                Thread.sleep(1);
            }
            catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}
