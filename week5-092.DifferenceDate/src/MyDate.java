
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        double yearDiff = 0.00;
        if (this.year > comparedDate.year) {
            yearDiff = (this.year + (double) this.month / 12 + (double) this.day / 365)
                    - (comparedDate.year + (double) comparedDate.month / 12
                    + (double) comparedDate.day / 365);
        } else {
            yearDiff = (comparedDate.year + (double) comparedDate.month / 12
                    + (double) comparedDate.day / 365)
                    - (this.year + (double) this.month / 12 + (double) this.day / 365);
        }
        return (int) yearDiff;
        //take first date, check how many days it has to the secondDate, convert to years.
        //while counting days, also count the date
//        int daysInAmonth = 30;
//        int monthsInAyear = 12;
//
//        int neededDay = this.day;
//        int neededMonth = this.month;
//        int neededYear = this.year;
//
//        int daysCount = comparedDate.day;
//        int monthsCount = comparedDate.month;
//        int yearsCount = comparedDate.year;
//
//        int totalDays = 0;
//
//         for (int i = daysCount; i <= daysInAmonth; i++) {
//            totalDays++; //total days track
//            daysCount++; //date track
//            if (daysCount >= daysInAmonth) {
//                monthsCount++;
//
//                daysCount = 1;
//
//                if (monthsCount >= monthsInAyear) {
//                    monthsCount = 1;
//                    yearsCount++;
//                    if (daysCount == this.day && monthsCount == this.month && yearsCount == this.year) {
//                        break;
//                    }
//                    i = 1;
//                }
//                i = 1;
//            }
//        }
//        System.out.println(totalDays);
//        return totalDays;
//        int yearDiff = 0;
//        int monthDiff = 0;
//        int daysDiff = 0;
//        int daysInAyear = 365;
//        int daysInAMonth = 30;
//        int result = 0;
//        if (comparedDate.earlier(this)) {
//            yearDiff = Math.abs(this.year - comparedDate.year);
//            monthDiff = Math.abs(this.month - comparedDate.month);
//            daysDiff = Math.abs(this.day - comparedDate.day);
//            int totalDateInDays = monthDiff * daysInAMonth + daysDiff + (yearDiff * daysInAyear);
//            while (totalDateInDays >= 365) {
//                result++;
//                totalDateInDays -= 365;
//            }
//        }
        // return result;
    }

}
