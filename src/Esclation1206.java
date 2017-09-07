import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esclation1206 {

	private String color = "";
	private String level = "";
	

	public static void main(String[] args) {
		String subproject;
		String s = "03|TP_0.01|s.01|oo.02|bb";
		String s1 ="";
		try {
			// String string_new;
			final String lvl[] = s.split("\\.");
			for (int i = 0; i < lvl.length; i++) {
				subproject = lvl[i];
				final Pattern p = Pattern.compile("^([0-9]+\\|)(.*)$");
				final Matcher m = p.matcher(subproject);
				if (m.matches()) {
					if (i == 0) {
						s1 = m.group(2);
					} else {
						s1 = s1 + "." + (m.group(2));
					}

				}
				System.out.println(s1);
			}
		} catch (final Exception e) {
		}

	}

}
