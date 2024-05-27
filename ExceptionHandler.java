public class ExceptionHandler {

    public void handleExceptions() {
        try {
            try {
                //  ArithmeticException
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }

            try {
                //  ArrayIndexOutOfBoundsException
                int[] array = new int[5];
                array[10] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        }
    }
}