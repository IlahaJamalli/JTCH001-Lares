package ThirdMonth.MentorLessons.Lesson21.Task1;

public enum BookCategory {
    FICTION(""),
    NON_FICTION(""),
    SCIENCE(""),
    HISTORY(""),
    FANTASY("Fantastik");

    private String value;

    BookCategory(String value) {
        this.value = value;
    }
}
