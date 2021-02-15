import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


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
				"understands code", "Doesn't understand code" });

		for (Map.Entry<String, String[]> person : people.entrySet()) {
			System.out.println(person.getKey() + " says: " + Arrays.toString(person.getValue()));
		}

		String person1 = null;
		String person2 = null;
		String person3 = null;
		String person4 = null;
		for (Map.Entry<String, String[]> person : people.entrySet()) {
			if (null == person1) {
				person1 = person.getKey();
			}
			else if (null == person2) {
				person2 = person.getKey();
			}
			else if (null == person3) {
				person3 = person.getKey();
			}
			else if (null == person4) {
				person4 = person.getKey();
			}
		}

		converse(person1, person2, people);
		System.out.println();
		converse(person3, person4, people);
	}

	private static void converse(String name1, String name2, Map<String, String[]> people) {
		String[] phrases1 = people.get(name1);
		String[] phrases2 = people.get(name2);

		for (int i = 0; i < phrases1.length; i++) {
			System.out.println(String.join("", name1, ": ", phrases1[i]));
			System.out.println(String.join("", name2, ": ", phrases2[i]));
		}
	}
}
