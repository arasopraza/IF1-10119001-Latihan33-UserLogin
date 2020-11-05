public class User {
    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private boolean statusAkun;

    private boolean cekAkun (String parUserName, String parPassword) {
        if ((parUserName.equals(username)) && (parPassword.equals(password))) {
            return statusAkun = true;
        } else {
            return statusAkun = false;
        }
    }

    private void hasilLogin(boolean status, String parUserName) {
        status = statusAkun;
        if (status) {
            System.out.println("******HALLO " + username + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("Oops, Username atau Password anda salah");
        }
    }

    public void pengecekanLogin(String parUserName, String parPassword) {
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
