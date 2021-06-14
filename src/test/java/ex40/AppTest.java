package ex40;

import ex39.App;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getDataSize() {
        App myApp = new App();

        String[] initialFName = {"John","Tou","Michaela","Jake","Jacquelyn","Sally"};
        String[] initialLName = {"Johnson","Xiong","Michaelson","Jacobson","Jackson","Webber"};
        String[] initialPosition = {"Manager","Software Engineer","District Manager","Programmer","DBA","Web Developer"};
        String[] initialSeparationDate = {"2016-12-31","2016-10-05","2015-12-19","","","2015-12-18"};

        ArrayList<Map> data = new ArrayList<>();
        for(int i = 0; i < initialFName.length; i++) {
            HashMap<String, String> newMap = new HashMap<>();
            newMap.put("First Name", initialFName[i]);
            newMap.put("Last Name", initialLName[i]);
            newMap.put("Position", initialPosition[i]);
            newMap.put("Separation Date", initialSeparationDate[i]);
            data.add(newMap);
        }
        int dataSize = myApp.getDataSize(data);
        int expected = 6;
        assertEquals(dataSize,expected);

    }
}