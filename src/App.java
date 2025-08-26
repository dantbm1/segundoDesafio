public class App {

    public static void main(String[] args) {   

        int vitorias = 15;
        int derrotas = 20;

        int saldo = calcularSaldo(vitorias, derrotas);

        String nivel = descobrirRank(saldo);

        System.out.printf("O Herói tem de saldo de " + saldo + " e está no nível de " + nivel);
    }

    // metodo para calcular saldo
    public static int calcularSaldo(int vitorias, int derrotas){
        return vitorias - derrotas;
    }

    // metodo para descobrir o rank
    public static String descobrirRank(int saldo){
        if (saldo < 10) {
            return "Ferro";
        } else if (saldo <= 20) {
            return "Bronze";
        } else if (saldo <= 50) {
            return "Prata";
        } else if (saldo <= 80) {
            return "Ouro";
        } else if (saldo <= 90) {
            return "Diamante";
        } else if (saldo <= 100) {
            return "Lendário";
        } else {
            return "Imortal";
        }
    }
}
