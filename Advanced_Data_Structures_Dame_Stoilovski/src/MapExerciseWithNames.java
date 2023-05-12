import java.util.HashMap;
import java.util.Map;

public class MapExerciseWithNames {
    public void checkNumberOfNames(String[] names) {
        Map<String, Integer> countingMap = new HashMap<>();

        for (String name : names) {
            if (countingMap.containsKey(name)) {
                int currentValue = countingMap.get(name);
                countingMap.put(name, currentValue + 1);
            } else {
                countingMap.put(name, 1);
            }
        }

        for (var entry: countingMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
