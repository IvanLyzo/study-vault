package app.brickhouse.studyvault.controller;

import app.brickhouse.studyvault.model.Page;
import app.brickhouse.studyvault.repository.StudyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pages")
public class PageController {

    private final StudyRepository repository;

    public PageController(StudyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Page> findAllPages() {
        return repository.findAllPages();
    }

    @GetMapping("/id={id}")
    public Optional<Page> findPageById(@PathVariable Integer id) {
        return repository.findPageById(id);
    }

    @GetMapping("/title={title}")
    public List<Page> findPagesByTitle(@PathVariable String title) {
        return repository.findPagesByTitle(title);
    }

    @GetMapping("/inFolder={folderTitle}")
    public List<Page> findPagesInFolder(@PathVariable String folderTitle) {
        return repository.findPagesInFolder(folderTitle);
    }
}
