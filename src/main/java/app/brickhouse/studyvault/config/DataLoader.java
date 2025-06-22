package app.brickhouse.studyvault.config;

import app.brickhouse.studyvault.model.Page;
import app.brickhouse.studyvault.repository.PageRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final PageRepository pageRepository;
    private final ObjectMapper objectMapper;

    public DataLoader(PageRepository pageRepository, ObjectMapper objectMapper) {
        this.pageRepository = pageRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        if (pageRepository.count() == 0) {
            try (InputStream inputStream = TypeReference.class.getResourceAsStream("data/content.json")) {
                pageRepository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Page>>(){}));
            }
        }
    }
}
