package annotations.advancedlevel.jsonfieldannotation;

class User {
    @JsonField(name = "user_id")
    private int id;

    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "user_email")
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

