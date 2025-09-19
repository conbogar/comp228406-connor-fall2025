package exercise1;

public class Singers {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int numberOfAlbums;

    //region constructors
    public Singers() {
        this.singerId = 0;
        this.singerName = "Default";
        this.singerAddress = "Default";
        this.dateOfBirth = "00/00/00";
        this.numberOfAlbums = 0;
    }

    public Singers(int singerId, String singerName, String singerAddress, String dateOfBirth, int numberOfAlbums) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }
    //endregion constructors
    //region getters
    public int getSingerId() {
        return singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfAlbums() {
        return numberOfAlbums;
    }
    //endregion getters
    //region setters
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    public void setSingerInformation(int singerId, String singerName, String singerAddress, String dateOfBirth, int numberOfAlbums) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbums = numberOfAlbums;
    }
    //endregion setters
}
