import java.util.Scanner;

public class AddTime extends UserMainCode109 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the time two intervals in hh:mm:ss format:");
		String time1 = scanner.next();
		String time2 = scanner.next();

		String result = addTime(time1, time2);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode109 {

	public static String addTime(String time1, String time2) {

		int hr = 0;
		int min = 0;
		int sec = 0;
		int day = 0;

		String timeSplitArr[][] = new String[2][];
		timeSplitArr[0] = time1.split(":");
		timeSplitArr[1] = time2.split(":");

		for (String timeSplit[] : timeSplitArr) {

			int count = 0;

			for (String times : timeSplit) {

				int time = Integer.parseInt(times);
				count++;

				if (count == 1 && time >= 0 && time < 24)
					hr += time;

				else if (count == 2 && time >= 0 && time <= 59)
					min += time;

				else if (count == 3 && time >= 0 && time <= 59)
					sec += time;

				else
					return "Invalid time";

			}
		}

		if (sec > 60) {

			sec -= 60;
			min += 1;
		}

		if (min > 60) {

			min -= 60;
			hr += 1;
		}

		if (hr > 24) {

			hr -= 24;
			day += 1;
		}

		return day + ":" + hr + ":" + min + ":" + sec;
	}
}