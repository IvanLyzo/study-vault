package app.brickhouse.studyvault.model;

import jakarta.annotation.Nullable;
import org.springframework.data.annotation.Id;

public record Page(
        @Id
        Integer id,
        String title,
        String description,
        @Nullable
        Folder folder,
        String data,
        Flashcard[] cards
) {
}
