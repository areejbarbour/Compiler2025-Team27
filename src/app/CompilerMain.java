package app;

public class CompilerMain {

    public static void main(String[] args) throws Exception {

        System.out.println("===== PYTHON ANALYSIS =====");
        PythonMain.main(new String[]{});

        System.out.println("\n===== WEB ANALYSIS =====");
        WebMain.main(new String[]{});
    }
}