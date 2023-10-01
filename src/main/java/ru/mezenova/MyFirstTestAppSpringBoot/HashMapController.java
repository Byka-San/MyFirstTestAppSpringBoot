package ru.mezenova.MyFirstTestAppSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HashMapController {

    private Map<Integer, String> integerStringMap = new HashMap<>();
    private List<String> stringList = new ArrayList<>(); // Добавляем список stringList

    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam("key") int key, @RequestParam("value") String value) {
        integerStringMap.put(key, value);
        return "Value updated in the HashMap: " + value;
    }

    @GetMapping("/show-map")
    public Map<Integer, String> showHashMap() {
        return integerStringMap;
    }

    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListSize = stringList.size();
        int hashMapSize = integerStringMap.size();

        return "Number of elements in ArrayList: " + arrayListSize + ", Number of elements in HashMap: " + hashMapSize;
    }
}
