package app.brickhouse.studyvault.repository;

import app.brickhouse.studyvault.model.Page;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;


public interface PageRepository {

    public List<Page> findAll();

}
