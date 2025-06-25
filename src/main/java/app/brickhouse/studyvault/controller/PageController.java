package app.brickhouse.studyvault.controller;

import app.brickhouse.studyvault.model.Page;
import app.brickhouse.studyvault.repository.PageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pages")
public class PageController {

    private final PageRepository pageRepository;

    public PageController(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @GetMapping
    public List<Page> findAll() {
        return pageRepository.findAll();
    }
}
