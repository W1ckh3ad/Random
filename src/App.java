public class App {
    public static void main(String[] args) throws Exception {
        int randomNo;

        try {
            for (;;) {
                randomNo = (int) (Math.random() * 10);
                if (randomNo == 0) {
                    throw new Exception("Der Wert darf nicht 0 sein");
                }
            }1
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
