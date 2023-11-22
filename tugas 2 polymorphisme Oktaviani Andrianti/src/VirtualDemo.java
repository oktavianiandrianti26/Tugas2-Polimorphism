public class VirtualDemo {
    public static void main(String[] args) {
        Pegawai staff = new Pegawai("oktaviani", "Padang", 1);
        Pegawai gajiStaff = new Gaji("Oktaviani", "Padang", 1, 2000000.0);
        staff.mailCheck();
        gajiStaff.mailCheck();
        System.out.println();

        Pegawai staff2 = new Pegawai("Andrianti", "Bukittinggi", 2);
        Pegawai gajiStaff2 = new Gaji("Andrianti", "Bukittinggi", 2, 3500000.0);
        staff2.mailCheck();
        gajiStaff2.mailCheck();
         System.out.println();

        Pegawai staff3 = new Pegawai("Yani", "Agam", 3);
        Pegawai gajiStaff3 = new Gaji("Yani", "Agam", 3, 1500000.0);
        staff3.mailCheck();
        gajiStaff3.mailCheck();
         System.out.println();
         
        // Polimorfisme
        double mounthlyPay1 = ((Gaji) gajiStaff).computePay();
        double mounthlyPay2 = ((Gaji) gajiStaff2).computePay();
        double mounthlyPay3 = ((Gaji) gajiStaff3).computePay();

        System.out.println();
        System.out.println("Pembayaran bulanan untuk " + gajiStaff.getName() + ": " + mounthlyPay1);
        System.out.println("Pembayaran bulanan untuk " + gajiStaff2.getName() + ": " +mounthlyPay2);
        System.out.println("Pembayaran bulanan untuk " + gajiStaff2.getName() + ": " +mounthlyPay3);
    }
}