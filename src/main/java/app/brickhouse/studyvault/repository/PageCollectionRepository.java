package app.brickhouse.studyvault.repository;

import app.brickhouse.studyvault.model.Flashcard;
import app.brickhouse.studyvault.model.Page;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PageCollectionRepository implements PageRepository {

    private final List<Page> pageList = new ArrayList<>();

    public PageCollectionRepository() {

    }

    @PostConstruct
    private void init() {
        Page page = new Page(1,
                "Quadratic Forumla",
                "a math note",
                null,
                "The quadratic formula is used to find the two roots of a quadratic equation",
                new Flashcard[]{});
        pageList.add(page);
    }

    @Override
    public List<Page> findAll() {
        return pageList;
    }
}
