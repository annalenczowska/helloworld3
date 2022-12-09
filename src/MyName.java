public class MyName {
    public static void main(String[] args) {
        String name = "Marcin";
        System.out.println("Moje imię to: " + name);

        for (int i = 0; i < 3; i++) {
            String guestName = "Zuzia";
            String firstName;

            firstName = switch (guestName) {
                case "Kasia", "Katarzyna" -> "Katarzyna";
                case "Zuza", "Zuzia" -> "Zuzanna";
                case "Basia", "Barbara" -> "Barbara";
                default -> "Guest";
            };
            System.out.println("Hello, " + firstName + "!");
        }
    }
}
