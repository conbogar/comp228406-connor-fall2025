package exercise1;
import java.time.LocalDate;

public class SingersDriver {
    public static void main(String[] args) {

        // Default values
        Singers singer1 = new Singers();
        System.out.println("Defaults:");
        printSinger(singer1);

        // Set values
        singer1.setSingerInformation(
                1234,
                "Mariah Carey",
                "25 Madison Ave",
                LocalDate.of(1969, 3, 27),
                16);
        System.out.printf("%nAfter set-all:%n");
        printSinger(singer1);

        // Change values
        singer1.setSingerId(5678);
        singer1.setSingerName("Jimi Hendrix");
        singer1.setSingerAddress("350 Monroe Ave");
        singer1.setDateOfBirth(LocalDate.of(1942, 11, 27));
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
