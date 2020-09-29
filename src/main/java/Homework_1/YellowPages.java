package Homework_1;

import java.util.HashMap;
import java.util.Map;

public class YellowPages {

    private Map<String, String> phonebook = new HashMap<>();

    public void add(String phoneNum, String surname) {
        //предположим что в справочник точно не смогут попасть одинаковые номера
        phonebook.put(phoneNum, surname);
    }

    public String get(String surname) {
        StringBuffer result = new StringBuffer();
        for (String key : phonebook.keySet()) {
            String  value = phonebook.get(key);
            if(surname.equals(value)){
                result.append(key+" ");
            }
        }
        result.insert(0, surname+" phones: ");
        return result.toString();
    }

    public void info(){
        System.out.println(phonebook.toString());
    }

    @Override
    public String toString() {
        return "YellowPages: " + phonebook.toString();
    }
}


