package OOPs;

public class Practice_5 {
    public static void main(String[] args) {
        holiday h1 = new holiday("Utrayan", 14, "Jan");
        holiday h2 = new holiday("Republic Day", 26, "Jan");
        holiday h3 = new holiday("Holi", 16, "March");
        holiday h4 = new holiday("Independence day", 15, "August");
        System.out.println(h2.inSameMonth(h3));

        holiday[] holidays = {h1,h2,h3,h4};

        double avg = holiday.avgDate(holidays);
        System.out.println(avg);


    }
}


class holiday{
    private String name;
    private int day;
    private String month;

    public holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(holiday temp){
        if(this.month == temp.month) {
            return true;
        }
        return false;
    }

    public static double avgDate(holiday[] holidays){
        double holidayAvg  =0;
        for(holiday i : holidays){
            holidayAvg += i.day;
        }
        holidayAvg /= holidays.length;
        return  holidayAvg;
    }


}