package testing.candelete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import testing.candelete.model.Language;
import testing.candelete.service.LanguageService;

@Controller
@RequestMapping("/language")
public class LanguageController {
    LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @RequestMapping(value = {"/all"}, method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("langList", languageService.findAll());
        return "language"; // html
    }

    @RequestMapping(value = {"/search/langName"}, method = RequestMethod.GET)
    public String searchName(@ModelAttribute("langName") String langName) {
        languageService.selectLangName(langName);
        return "language"; // html
    }
}
