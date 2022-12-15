package TDs.TD10;

import java.util.List;

public class EspCollator {
    private final List<String> Collator = List.of("A B C Ĉ D E F G Ĝ H Ĥ I J Ĵ K L M N O P R S Ŝ T U Ŭ V Z".split(" "));

    public EspCollator() {
    }

    public boolean compatible() {
        return true;
    }
}
