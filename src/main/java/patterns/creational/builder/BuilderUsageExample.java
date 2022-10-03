package patterns.creational.builder;

public class BuilderUsageExample {

    public static void main(String[] args) {
        User newUser = User.newBuilder().setUserId(1).setName("User_1").build();
        System.out.println("User id: " + newUser.getId());
        System.out.println("User name: " + newUser.getName());

        UserWithLombok lombokUser = UserWithLombok.builder().id(2).name("Lombok_User").build();
        System.out.println("LombokUser id: " + lombokUser.getId());
        System.out.println("LombokUser name: " + lombokUser.getName());
    }

}
