/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author anishgarg
 */
public class utility {
    public static Map<String,List<String>> getCourseSubjects()//STATIC SO THAT IT IS EASSY TO USE
    {
        Map<String,List<String>> maps=new HashMap<>();
        List<String> sub=new ArrayList<>();
        sub.add("physics");
        sub.add("chemistry");
        sub.add("maths");
        maps.put("Bsc", sub);
        sub=new ArrayList<>();
        sub.add("accounts");
        sub.add("economics");
        sub.add("maths");
        maps.put("Commerce", sub);
         sub=new ArrayList<>();
        sub.add("Java");
        sub.add("Networking");
        sub.add("ADBMS");
        maps.put("Engg", sub);
        
        return maps;
        
    }
}
