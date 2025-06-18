class Marathon {
    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        int bestindex = 0;
        int besttime = times[0];

        for (int i = 0; i < names.length; i++) {
            if (times[i] <= besttime) {
                besttime = times[i];
                bestindex = i;
            }
        }

        System.out.println(names[bestindex] + ": " + times[bestindex]);

        int secondbest = -1;
        int secondbesttime = Integer.MAX_VALUE;

        for (int i = 0; i < times.length; i++) {
            if (times[i] > besttime && times[i] < secondbesttime) {
                secondbesttime = times[i];
                secondbest = i;
            }
        }
        System.out.println(names[secondbest] + ": " + times[secondbest]);
    }
}