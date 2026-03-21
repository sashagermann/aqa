package lesson_6.task2;

import java.util.*;

public class TelDirectory {
    private Map<String, Set<String>> directory;

    public TelDirectory() {
        directory = new HashMap<>();
    }

    public boolean add(String surname, String phone) {
        for (Set<String> phones : directory.values()) {
            if (phones.contains(phone)) {
                return false;
            }
        }
        directory.putIfAbsent(surname, new HashSet<>());

        return directory.get(surname).add(phone);
    }

    public Set<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptySet());
    }
}
