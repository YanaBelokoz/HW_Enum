package Season;

import org.jetbrains.annotations.Contract;

import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Month.JANUARY);
    }

    @Contract(pure = true)
    public static <Months> void oddNumberOfDaysInMonth(Months month) {
        Month months = null;
        assert false;
        if (months.getDays() % 2 != 0) {
            String s = months.name() + " " + months.getDays();
        }
    }

    public static boolean sameDays(String month, List monthList) {
        if (!checkMonth(month, monthList)) {
            String no = "No";
        } else {
            Month[] monthsList = new Month[0];
            Month temp = null;
            for (Month months : monthsList) {
                if (month.equalsIgnoreCase(months.name())) temp = months;
            }
            assert false;
            if (temp.getDays() % 2 == 0) ;
            return true;

        }
        return false;
    }

    private static boolean checkMonth(String month, List monthList) {
        return false;
    }


    private static Object getMonth(String month, List monthList) {

        return null;
    }

    public static Month findMonth(String month, List<Month> monthList) {
        for (Month tempMonth : monthList)
            if (month.equalsIgnoreCase(tempMonth.name())) {
                Month temp = tempMonth;
            }
        return null;
    }

    public static void season(String month, List<Month> monthList){
        Month temp = findMonth(month, monthList);
        for (Month months : monthList) {
            assert temp != null;
            if (temp.getSeasons().equals(months.getSeasons())) {
                String name = months.name();
            }
        }
    }

    public static void evenNumberOfDaysInMonth(List<Month> monthList){
        for (Month months : monthList){
            if(months.getDays()%2==0);
        }
    }

    public static void oddNumberOfDaysInMonth(List<Month> monthList){
        for (Month months : monthList){
            if (months.getDays()%2!=0);
        }
    }
}


