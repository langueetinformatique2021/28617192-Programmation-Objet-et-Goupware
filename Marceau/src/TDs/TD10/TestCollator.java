package TDs.TD10;

import java.text.Collator;
import java.text.ParseException;
import java.text.RuleBasedCollator;

public class TestCollator {
    public static void main(String[] args) throws ParseException {
        EspCollator EC= new EspCollator();
        Collator C = Collator.getInstance();
        Collator RBC = RuleBasedCollator.getInstance();

    }

}
