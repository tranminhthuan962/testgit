package testing.candelete.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Language {
    String langId;
    String langName;
    String lastUpdate;

    public Language(String langId, String langName, String lastUpdate) {
        this.langId = langId;
        this.langName = langName;
        this.lastUpdate = lastUpdate;
    }

}
