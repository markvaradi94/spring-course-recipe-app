package guru.springframework.domain;

public enum Difficulty {
    EASY("Easy"),
    MODERATE("Moderate"),
    KIND_OF_HARD("Kind of hard"),
    HARD("Hard");

    private final String message;

    Difficulty(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
