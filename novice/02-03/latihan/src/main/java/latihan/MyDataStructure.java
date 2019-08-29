package latihan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * MyDataStructure
 * @author Supi Core - August 28, 2019
 */
public class MyDataStructure {
    List<String> list = new ArrayList<String>();

    public void add (String s){
        list.add(s);
    }

    public List<String> getList(){
        return Collections.unmodifiableList(list);
    }
}