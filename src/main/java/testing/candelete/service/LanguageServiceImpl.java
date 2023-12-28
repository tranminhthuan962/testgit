package testing.candelete.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import testing.candelete.mapper.LanguageMapper;
import testing.candelete.model.Language;

import java.util.List;

@Slf4j
@Service
public class LanguageServiceImpl implements LanguageService{
    LanguageMapper languageMapper;

    public LanguageServiceImpl(LanguageMapper languageMapper) {
        this.languageMapper = languageMapper;
    }

    @Override
    public List<Language> findAll() {
        return languageMapper.findAll();
    }
}
