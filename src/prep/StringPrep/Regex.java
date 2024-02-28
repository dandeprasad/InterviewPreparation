package prep.StringPrep;

import java.util.ArrayList;
import java.util.List;

public class Regex {

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = new ArrayList<>(data);
    }

    List<String> data = new ArrayList<>();

    public static void main(String [] args){

        String[] camelCaseWords = "saveChanges.1InTheEditor".split("([.])");
        //[a-zA-Z_0-9]
        System.out.println(camelCaseWords);

//. means "any character".
//                * means "any number of this".
//.* therefore means an arbitrary string of arbitrary length.
//^ indicates the beginning of the string.
//        $ indicates the end of the string.
    }
}
