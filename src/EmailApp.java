public class EmailApp {
    public static void main(String[] args){
        Email eml = new Email("Josh", "Johnson");
        System.out.println(eml.showInfo());
        eml.setAlternateEmail("ROBBIELCAMPBELL@HOTMAIL.COM");
        System.out.println(eml.getAlternateEmail());
    }
}
