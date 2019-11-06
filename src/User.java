public class User {

    private String name;
    private String email;
    private String phoneNumber;
    private long uid;
    private String hashPassword;
    private static long new_uid = 0;

    public long getUid() {
        return uid;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getHashPassword() {
        return hashPassword;
    }

    public User(String name, String email, String hashPassword) {

        this.uid = new_uid++;
        this.name = name;
        this.name = name;
        this.email = email;
        this.hashPassword = hashPassword;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

}
