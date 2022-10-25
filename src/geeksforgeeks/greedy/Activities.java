package geeksforgeeks.greedy;

import java.util.Arrays;

/**
 * You are given n activities with their start and finish times. Select the
 * maximum number of activities that can be performed by a single person,
 * assuming that a person can only work on a single activity at a time
 */

public class Activities {
	/**
	 * we suppose that we have at least one activity
	 * 
	 * @param s start time of activities
	 * @param f finish time of activities
	 */
	public int getMaxActivities(int s[], int f[]) {
		int maxJobs = 1;
		Activity[] activities = new Activity[s.length];
		// sort activities by their finish time
		for (int i = 0; i < s.length; i++) {
			activities[i] = new Activity(s[i], f[i]);
		}
		Arrays.sort(activities);
		int currentActivity = 0;
		for (int a = 1; a < activities.length; a++) {
			if (activities[a].start >= activities[currentActivity].finish) {
				maxJobs++;
				currentActivity = a;
			}
		}
		return maxJobs;

	}

	private class Activity implements Comparable<Activity> {
		int start, finish;

		public Activity(int start, int finish) {
			super();
			this.start = start;
			this.finish = finish;
		}

		@Override
		public int compareTo(Activity o) {
			return this.finish - o.finish;
		}

	}

	public static void main(String[] args) {
		Activities activities = new Activities();
		System.out.println(
				activities.getMaxActivities(new int[] { 1, 3, 0, 5, 8, 5 },
						new int[] { 2, 4, 6, 7, 9, 9 }));

	}

}
