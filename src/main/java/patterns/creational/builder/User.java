package patterns.creational.builder;

public class User {

    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Builder newBuilder() {
        return new User().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setUserId(int userId) {
            User.this.id = userId;
            return this;
        }

        public Builder setName(String name) {
            User.this.name = name;
            return this;
        }

        public User build() {
            return User.this;
        }

    }

}
