package kata;

import java.util.ArrayList;
import java.util.List;

public class ListFilteringKata {
    public static void main(String[] args) {
        Object ob = new Object();
        ob = "test";
        System.out.println(ob.getClass());
        ob = 1;
        System.out.println(ob.getClass());
        System.out.println(filterList(List.of(2,"1")));
    }
    public static List<Object> filterList(final List<Object> list){
        List<Object> filteredArrayList = new ArrayList<Object>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getClass().equals(Integer.class)){
                filteredArrayList.add(list.get(i));
            }
        }
        return filteredArrayList;
    }
}
