import java.util.*;
import java.text.*;

public class ShowToday {
  public static void main(String args[]) {
     ShowToday st = new ShowToday();
     st.demo();
     }
  public void demo() {   
     System.out.println(easyDateFormat("dd MMMMM yyyy"));
     System.out.println(easyDateFormat("yyyyMMdd"));
     System.out.println(easyDateFormat("dd.MM.yy hh:mm:ss z"));
     System.out.println(easyDateFormat("MM/dd/yyyy hh:mm:ss z "));
     System.out.println(easyDateFormat("yyyy.MM.dd G 'at' hh:mm:ss z"));
     System.out.println(easyDateFormat("EEE, MMM d, ''yy"));
     System.out.println(easyDateFormat("h:mm a"));
     System.out.println(easyDateFormat("H:mm:ss:SSS"));
     System.out.println(easyDateFormat("K:mm a,z"));
     System.out.println(easyDateFormat("yyyy.MMMMM.dd GGG hh:mm aaa"));
     }

  public String easyDateFormat (String format) {
    Date today = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat(format);
    String datenewformat = formatter.format(today);
    return  datenewformat;
    }
    }