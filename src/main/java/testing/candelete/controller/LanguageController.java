package testing.candelete.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import testing.candelete.mapper.LanguageMapper;
import testing.candelete.model.Language;
import testing.candelete.service.LanguageService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/language")
public class LanguageController {
    LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @RequestMapping(value = {"/all"}, method = RequestMethod.GET)
    public String getAll(Model model){
        model.addAttribute("langList", languageService.findAll());
        return "language"; // html
    }
}
