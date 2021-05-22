public class SecondsAndMinutesChallange {
    public static void main(String[] args) {
//getDurationString(210,90);
getDurationString(3945L);
    }

    public static String getDurationString(long minutes, long seconds) {
        if((minutes<0) || (seconds<=0 || seconds>59)) {
            System.out.println("Invalid");
            return "Invalid Value";
        }
            long hour = minutes/60;
            long remainingMinutes = minutes%60;
            return hour + " h " + remainingMinutes + " m " + seconds + " s ";


    }

    public static String getDurationString(long seconds) {
        if(seconds<0) {
            return "Invalid value";
        }
            long min = seconds/60;
            long remainingSec = seconds%60;
            return getDurationString(min,remainingSec);

    }

}
