public class onedim_array {
    // one dim array
    public static void main(String[] args) {
        
    // type  1:
        int month_day[];
        
        month_day = new int [12];
        month_day[0]= 31;
        month_day[1]= 28;
        month_day[2]= 31;
        month_day[3]= 30;
        month_day[4]= 31;
        month_day[5]= 30;
        month_day[6]= 31;
        month_day[7]= 31;
        month_day[8]= 30;
        month_day[9]= 31;
        month_day[10]= 30;
        month_day[11]= 31;

        System.out.println("januari has   "+month_day[0]+"  days.");


    //=================================================================

    //type 2:
    int month_days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("april has   "+month_days[3]+"   days.");

     }
}
