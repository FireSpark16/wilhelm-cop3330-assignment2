package ex33;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("inline value 1")
    @RepeatedTest(10)

     void test1() {
        App myApp = new App();
        int low = 0;
        String[] outcomes = {"It is certain","It is decidedly so","Without a doubt","Yes, definitely","You may rely on it","As I see it, yes","Most likely","Outlook good","Yes","Signs point to yes","Reply hazy try again","Ask again later","Better not tell you now","Cannot predict now","Concentrate and ask again","Don't count on it","My reply is no","My sources say no","Outlook not so good","Very doubtful"};
        int max = outcomes.length;
        int random = myApp.eightBall(outcomes);
        assertTrue(random <= max);
        assertTrue(random >= low);
    }
}