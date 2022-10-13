package strings;

import java.util.Scanner;
import java.util.regex.*;

public class ThreatAnalyzer {
    static String threatData =
            "58.27.82.161@08/10/2015\n" +
                    "204.45.234.40@08/11/2015\n" +
                    "58.27.82.161@08/11/2015\n" +
                    "58.27.82.161@08/12/2015\n" +
                    "58.27.82.161@08/12/2015\n" +
                    "[Next log section with different data format]";
    public static <MatchResult> void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" +
                "(\\d{2}/\\d{2}/\\d{4})";//定义数据的格式。跟原来的匹配，就跟日期类一样。
        while(scanner.hasNext(pattern)) {
            scanner.next(pattern);
            java.util.regex.MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format(
                    "Threat on %s from %s%n", date,ip);
        }
    }
}
/* Output:
Threat on 08/10/2015 from 58.27.82.161
Threat on 08/11/2015 from 204.45.234.40
Threat on 08/11/2015 from 58.27.82.161
Threat on 08/12/2015 from 58.27.82.161
Threat on 08/12/2015 from 58.27.82.161
*/
