package app.brickhouse.studyvault.controller;

import app.brickhouse.studyvault.model.Folder;
import app.brickhouse.studyvault.repository.StudyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/folders")
public class FolderController {

    private final StudyRepository repository;

    public FolderController(StudyRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Folder> findAllFolders() {
        return repository.findAllFolders();
    }

    @GetMapping("/id={id}")
    public Optional<Folder> findFolderById(@PathVariable Integer id) {
        return repository.findFolderById(id);
    }

    @GetMapping("/title={title}")
    public List<Folder> findFoldersByTitle(@PathVariable String title) {
        return repository.findFoldersByTitle(title);
    }
}
