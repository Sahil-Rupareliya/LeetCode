package CP;

import java.util.Arrays;


public class Trilogy {
    public static void main(String[] args) {
        int A = 2;
        int M = 1;
        int[][] B = {
                {1, 2, 1}
        };

        int[] result = scheduleWork(A, M, B);
        System.out.println(Arrays.toString(result));
    }


    public static int[] scheduleWork(int A, int M, int[][] B) {
            int[] schedule = new int[A + 1];
            Arrays.fill(schedule, 0);

            // Sort work types based on deadline days
            Arrays.sort(B, (a, b) -> a[1] - b[1]);

            for (int[] work : B) {
                int workType = work[0];
                int givenDay = work[1];
                int daysToComplete = work[2];

                for (int day = Math.min(A, givenDay + daysToComplete - 1); day >= givenDay; day--) {
                    if (schedule[day] == 0) {
                        schedule[day] = workType;
                        break;
                    }
                }
            }

            int deadlineWork = 1;
            for (int i = 1; i <= A; i++) {
                if (schedule[i] == 0) {
                    schedule[i] = -1; // Rest day
                } else if (schedule[i] == deadlineWork) {
                    deadlineWork++;
                    if (deadlineWork > M) {
                        deadlineWork = M + 1;
                    }
                }
            }

            if (deadlineWork <= M) {
                return new int[]{-1}; // Unable to complete all work before the deadline
            } else {
                return schedule;
            }
        }
    }


