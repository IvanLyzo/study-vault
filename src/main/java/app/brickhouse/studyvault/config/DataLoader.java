package app.brickhouse.studyvault.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

//    private final PageRepository pageRepository;
//    private final ObjectMapper objectMapper;
//
//    public DataLoader(PageRepository pageRepository, ObjectMapper objectMapper) {
//        this.pageRepository = pageRepository;
//        this.objectMapper = objectMapper;
//    }

    @Override
    public void run(String... args) throws Exception {
        // TODO: Fix DataLoader

//        if (pageRepository.count() == 0) {
//            try (InputStream inputStream = TypeReference.class.getResourceAsStream("data/content.json")) {
//                pageRepository.saveAll(objectMapper.readValue(inputStream, new TypeReference<List<Page>>(){}));
//            }
//        }
    }
}
