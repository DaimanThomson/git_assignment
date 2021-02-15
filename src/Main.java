import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args) {
		Map<String, String[]> people = new HashMap<>();
		people.put("Daiman", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code" });
		people.put("Autumn", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code" });
		people.put("Jesse", new String[] { "wins the lottery", "loses the lottery", "drives to Idaho",
				"understands code", "Doesn't understand code" });


		String person1 = null;
		String person2 = null;
		for (Map.Entry<String, String[]> person : people.entrySet()) {
			if (null == person1) {
				person1 = person.getKey();
			}
			else if (null == person2) {
				person2 = person.getKey();
			}
		}

		converse(person1, person2, people);
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
