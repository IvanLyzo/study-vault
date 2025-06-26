package app.brickhouse.studyvault.repository;

import app.brickhouse.studyvault.model.Flashcard;
import app.brickhouse.studyvault.model.Folder;
import app.brickhouse.studyvault.model.Page;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudyCollectionRepository implements StudyRepository {

    private final List<Folder> folderList = new ArrayList<>();
    private final List<Page> pageList = new ArrayList<>();


    public StudyCollectionRepository() {

    }

    @PostConstruct
    private void init() {
        Folder math = new Folder(1, "Math", null);
        folderList.add(math);

        Page page = new Page(1,
                "Quadratic Formula",
                "a math note",
                math,
                "The quadratic formula is used to find the two roots of a quadratic equation",
                new Flashcard[]{});
        pageList.add(page);
    }

    @Override
    public List<Folder> findAllFolders() {
        return folderList;
    }

    @Override
    public Optional<Folder> findFolderById(int id) {
        return folderList.stream().filter(f -> f.id().equals(id)).findFirst();
    }

    @Override
    public List<Folder> findFoldersByTitle(String title) {
        List<Folder> folders = new ArrayList<>();

        for (Folder folder : folderList) {
            if (folder.name().equalsIgnoreCase(title)) {
                folders.add(folder);
            }
        }

        return folders;
    }

    @Override
    public List<Page> findAllPages() {
        return pageList;
    }

    @Override
    public Optional<Page> findPageById(int id) {
        return pageList.stream().filter(p -> p.id().equals(id)).findFirst();
    }

    @Override
    public List<Page> findPagesByTitle(String title) {
        List<Page> pages = new ArrayList<>();

        for (Page page : pageList) {
            if (page.title().equalsIgnoreCase(title)) {
                pages.add(page);
            }
        }

        return pages;
    }

    @Override
    public List<Page> findPagesInFolder(String folderTitle) {
        List<Page> pages = new ArrayList<>();

        for (Page page : pageList) {
            if (page.folder() == null) {
                continue;
            }

            if (page.folder().name().equalsIgnoreCase(folderTitle)) {
                pages.add(page);
            }
        }

        return pages;
    }
}
