public class Solution {
    public static void printBonusDatesBetween(int fromYear, int toYear) {
        int[] years = new int[toYear - fromYear + 1];
        String[] toPrint = new String[toYear - fromYear + 1];
        for (int i = 0; i < years.length; i++) {
            years[i] = fromYear + i;
        }
        for (int i = 0; i < years.length; i++) {
            int year = years[i];
            String reversedYear = new StringBuilder(Integer.toString(year)).reverse().toString();
            String monthAfterReverse = reversedYear.substring(0, 2);
            String dayAfterReverse = reversedYear.substring(2);
            int month = Integer.parseInt(monthAfterReverse);
            int day = Integer.parseInt(dayAfterReverse);
            if(day > 0 && day <= 12 && month > 0 && month <= 12)
                toPrint[i] = Integer.toString(year) + "-" + monthAfterReverse + "-" + dayAfterReverse;
        }
        for (String date : toPrint) {
            if (date != null)
                System.out.println(date);
        }

    }

    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }
}
