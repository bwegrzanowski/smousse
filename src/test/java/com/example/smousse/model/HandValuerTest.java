package com.example.smousse.model;

import org.junit.Test;
import java.util.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class HandValuerTest {

    private static final Map<Integer, List<String>> HANDS_BY_VALUE = new HashMap<>();

    static {
//        HANDS_BY_VALUE.put(0, asList());
        HANDS_BY_VALUE.put(1, asList("Ac"));
        HANDS_BY_VALUE.put(2, asList("Ad Ah", "2h"));
        HANDS_BY_VALUE.put(3, asList("Ac 2d", "3s"));
        HANDS_BY_VALUE.put(4, asList("2c 2d", "Ac 3d"));
        HANDS_BY_VALUE.put(5, asList("Ac 2d 2c"));
        HANDS_BY_VALUE.put(6, asList("3c 3d"));
        HANDS_BY_VALUE.put(7, asList("3c 2d Ac Ah"));
        HANDS_BY_VALUE.put(8, asList("4c 2d 2c"));
        HANDS_BY_VALUE.put(9, asList("2c 2d 5c", "Ac 2c 3h 3s"));
        HANDS_BY_VALUE.put(10, asList("Jc", "Ks", "Th", "Qd", "5c 5d", "9h Ac"));
        HANDS_BY_VALUE.put(11, asList("Jc Ac", "Qd Ah", "5c 6d", "9h 2c"));
        HANDS_BY_VALUE.put(12, asList("Jc 2c", "Qd 2h", "6c 6d", "9h 3c"));
        HANDS_BY_VALUE.put(13, asList("Jc 3c", "Qd 3h", "7c 6d", "9h 4c"));
        HANDS_BY_VALUE.put(14, asList("Jc 4c", "Qd 4h", "8c 6d", "7h 7c"));
        HANDS_BY_VALUE.put(15, asList("Jc 5c", "Qd 2h 3h", "6c 5d Ad 3c", "9h 3c Ac Ad Ah"));
        HANDS_BY_VALUE.put(20, asList("Jc Qh", "Qd Kh", "6c 6d 8c", "9h 3c 4h 4d"));
        HANDS_BY_VALUE.put(50, asList("Jc Jd Kh Qs Ts"));
    }

    @Test
    public void assertValue() {
        Set<Map.Entry<Integer, List<String>>> entries = HANDS_BY_VALUE.entrySet();
        for (Map.Entry<Integer, List<String>> entry : entries) {
            int expected = entry.getKey();
            for (int i = 0; i < entry.getValue().size(); i++) {
                int actual = HandValuer.value(CardReader.toCardList(entry.getValue().get(i)));
                assertEquals(expected, actual);
            }
        }
    }

}
