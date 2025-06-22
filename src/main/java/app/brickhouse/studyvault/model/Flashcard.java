package app.brickhouse.studyvault.model;

import jakarta.persistence.Id;

public record Flashcard(
        @Id
        Integer id,
        String name,
        String question,
        String answer
) {
}
