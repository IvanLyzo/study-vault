package app.brickhouse.studyvault.repository;

import app.brickhouse.studyvault.model.Folder;
import app.brickhouse.studyvault.model.Page;

import java.util.List;
import java.util.Optional;


public interface StudyRepository {

    List<Folder> findAllFolders();
    Optional<Folder> findFolderById(int id);
    List<Folder> findFoldersByTitle(String title);

    List<Page> findAllPages();
    Optional<Page> findPageById(int id);
    List<Page> findPagesByTitle(String title);
    List<Page> findPagesInFolder(String folderTitle);
}
