// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {




        // Hello word padrao
        System.out.println("Hello Word");
        // Variaveis
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        float divid = (float) a / b;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(divid);

        // Tipos booleanos

        boolean fds = true;
        boolean sol = true;
        String msg = fds ? "topzera" : "azedou";
        System.out.println(msg);

        // Condicionais

        int nota = 80;
        String graduacao;

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota <60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }
    switch (graduacao){
        case "A":
        case "B":
            System.out.println("Aproved");
            break;
        case "C":
        case "D":
            System.out.println("Reprovado");
        default:
            System.out.println("invalida");}

        // manipulacao de string e datas

        String nome = "Victor";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String outroNome = "viCTor";
        System.out.println(nome.equalsIgnoreCase(outroNome));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
//        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() <12){
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() <18) {
            saudacao = "boa tarde";
        } else if (agora.getHour()>= 18  && agora.getHour() <24) {
            saudacao = "boa noite";
        } else {saudacao= "oi";}


        System.out.printf("Ola, %s. Hoje e %s, %s.%n", nome,diaSemana, saudacao.toUpperCase());

        // repeticoes
        // para uma variavel q se inicia em 1, vai ate 10, mudando 1-por-1, faca:
        for (int i = 1; i<= 10; i++){
            for (int j = 1; j<=10; j++){
                System.out.println(j + "x" + i + "=" + j*i);
            }
        }
        // vetores
        int[] arrayNumeros = new int [5];
        arrayNumeros[0] = 1;
        arrayNumeros[1] = 2;
        arrayNumeros[2] = 3;
        arrayNumeros[3] = 4;
        arrayNumeros[4] = 5;
        for (int i=0; i < arrayNumeros.length; i++){
            System.out.println(arrayNumeros[i]);
        }
    String[] letras = {"A","B","C","D"};
        for (int i=0; i<letras.length;i++){
            System.out.println(letras[i]);}

        System.out.println(Arrays.toString(letras));

        int [] numerosX = {9,10,12,25,2};
        int maior = numerosX[0];
        int menor = numerosX[0];
        int media = 0;
        for (int i=0; i<numerosX.length;i++){
            if (numerosX[i] > maior) {
                maior = numerosX [i];
            }
            if (numerosX[i] < menor){
                menor = numerosX[i];
            }
            media += numerosX [i];
        }
        System.out.println("Maior :" + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media:" + media/numerosX.length);

        //chamad de funcoes
        funcaoOla();
        String nome3 = "Vitao";
        funcaoOlaComParam(nome3);
        int resultado = soma(2,3);
        System.out.println(resultado);

    }

    //funcoes
    public static void funcaoOla(){
        System.out.println("Hello");}
    //
    public static void funcaoOlaComParam(String nome3){
        System.out.println("Hello,  " + nome3);

    }
    public static int soma( int a, int b){
        return a+b;
    }

}