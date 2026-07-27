public class Aluno {
    String name;
    double n1 , n2 , n3;

    double NotaFinal () {
        return n1+n2+n3;
    }
    public void Resultado () {
        if (NotaFinal() >= 60){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",  60.00-NotaFinal());
        }
    }
}
