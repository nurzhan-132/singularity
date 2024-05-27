import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneJournal {
    private Map<String, List<String>> phoneJournal;

    public TelephoneJournal() {
        phoneJournal = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (!phoneJournal.containsKey(lastName)) {
            phoneJournal.put(lastName, new ArrayList<>());
        }
        phoneJournal.get(lastName).add(phoneNumber);
    }

    public String get(String lastName) {
        return lastName + ": " + phoneJournal.getOrDefault(lastName, new ArrayList<>());
    }


    public static void main(String[] args) {
        TelephoneJournal phoneJournal = new TelephoneJournal();

        phoneJournal.add("Momynkul", "+77715947474");
        phoneJournal.add("Askarov", "+77715633232");
        phoneJournal.add("Askarov", "+77715645632");
        phoneJournal.add("Tokayev", "+77777777777");
        phoneJournal.add("Momynkul", "+777723333232");

        System.out.println(phoneJournal.get("Momynkul"));
        System.out.println(phoneJournal.get("Askarov"));
        System.out.println(phoneJournal.get("Tokayev"));
        System.out.println(phoneJournal.get("Unknown"));
    }
}
