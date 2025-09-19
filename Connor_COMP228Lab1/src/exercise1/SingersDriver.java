package exercise1;

public class SingersDriver {
    public static void main(String[] args) {

        // Default values
        Singers singer1 = new Singers();
        System.out.println("Defaults:");
        printSinger(singer1);

        // Set values
        singer1.setSingerInformation(1234, "Mariah Carey", "25 Madison Ave", "March 27, 1969", 16);
        System.out.printf("%nAfter set-all:%n");
        printSinger(singer1);

        // Change values
        singer1.setSingerId(5678);
        singer1.setSingerName("Jimi Hendrix");
        singer1.setSingerAddress("350 Monroe Ave");
        singer1.setDateOfBirth("November 27, 1942");
        singer1.setNumberOfAlbums(3);

        System.out.printf("%nAfter individual changes:%n");
        printSinger(singer1);
    }
        private static void printSinger(Singers s) {
            System.out.printf(
                    "Singer ID: %d%n" +
                    "Singer name: %s%n" +
                    "Singer address: %s%n" +
                    "Singer date of birth: %s%n" +
                    "Number of albums: %d%n",
                    s.getSingerId(),
                    s.getSingerName(),
                    s.getSingerAddress(),
                    s.getDateOfBirth(),
                    s.getNumberOfAlbums()
            );
        }

}
