package app.brickhouse.studyvault.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Id;

public record Folder(
        @Id
        Integer id,
        String name,
        @Nullable
        Folder parent
) {
}
