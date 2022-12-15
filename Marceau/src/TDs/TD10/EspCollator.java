package TDs.TD10;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.List;

public class EspCollator extends RuleBasedCollator {
    private final String collator = "A B C Ĉ D E F G Ĝ H Ĥ I J Ĵ K L M N O P R S Ŝ T U Ŭ V Z";
    private final List<String> Collator = List.of(this.collator.split(" "));

    public EspCollator() throws ParseException {
        super("A B C Ĉ D E F G Ĝ H Ĥ I J Ĵ K L M N O P R S Ŝ T U Ŭ V Z");
    }

    public boolean compatible() {
        return true;
    }
}
