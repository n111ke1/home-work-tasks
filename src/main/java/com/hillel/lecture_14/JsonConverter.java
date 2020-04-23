package com.hillel.lecture_14;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.sql.Array;
import java.util.Arrays;
import java.util.*;
import java.util.List;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users){

//        TODO implements result
        String result = "";

//        ArrayList<HashMap> hashUsers = new ArrayList<HashMap>();
//        for (User user:users) {
//        }

        return result;
    }

    public String convertToJsonString(User users) {

//        TODO implements result
        String result = "";

        HashMap<String, Object> huser = new HashMap<>();

        Field[] declaredFields = users.getClass().getDeclaredFields();
        for (Field field:declaredFields) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            try {
                huser.put(field.getName(), field.get(users));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(huser);


        return result;
    }



}
