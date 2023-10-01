package ru.mezenova.MyFirstTestAppSpringBoot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArrayController {

    private List<String> stringList = new ArrayList<>();

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam("value") String value) {
        if (stringList.isEmpty()) {
            stringList.add(value);
        } else {
            stringList.set(0, value);
        }
        return "Value updated in the ArrayList: " + value;
    }

    @GetMapping("/show-array")
    public List<String> showArrayList() {
        return stringList;
    }
}
