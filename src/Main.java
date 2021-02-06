import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String, String[]> people = new HashMap<>();
		people.put("Daiman", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code" });
		people.put("Trevor", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code" });
		people.put("Riley", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code" });
		people.put("Autumn", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code" });
		people.put("Jesse", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code"});

		for (Map.Entry<String, String[]> person : people.entrySet()) {
			System.out.println(person.getKey() + " says: " + Arrays.toString(person.getValue()));
		}
	}
}
