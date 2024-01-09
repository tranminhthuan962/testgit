package testing.candelete.service;

import testing.candelete.model.Language;

import java.util.List;

public interface LanguageService {
    List<Language> findAll();
    List<Language> selectLangName(String name);
}
