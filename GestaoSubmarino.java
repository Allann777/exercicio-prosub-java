import java.util.Scanner;

public class GestaoSubmarino {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEMA DE COMANDO PROSUB 2026 ---");

        // =============================
        // 1ª SITUAÇÃO: Orçamento
        // =============================
        System.out.print("Informe o repasse anual (em bilhões): ");
        double orcamento = sc.nextDouble();

        if (orcamento < 0.5) {
            System.out.println("Status: ALERTA: Risco de paralisação total. Data estimada: 2045.");
        } 
        else if (orcamento >= 0.5 && orcamento <= 1.0) {
            System.out.println("Status: Ritmo lento: Finalização prevista para 2037.");
        } 
        else {
            System.out.println("Status: Projeto acelerado: Possibilidade de antecipação da entrega.");
        }

        // =============================
        // 2ª SITUAÇÃO: Acesso
        // =============================
        sc.nextLine(); // limpa buffer

        System.out.print("\nInforme o país de origem da solicitação: ");
        String pais = sc.nextLine();

        System.out.print("Nível de acesso solicitado: ");
        String nivel = sc.nextLine();

        if (nivel.equalsIgnoreCase("TOTAL") && !pais.equalsIgnoreCase("Brasil")) {
            System.out.println("Status: ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados.");
        } 
        else if (pais.equalsIgnoreCase("Brasil")) {
            System.out.println("Status: Acesso autorizado ao Almirantado.");
        }

        // =============================
        // 3ª SITUAÇÃO: Propulsão
        // =============================
        System.out.print("\nInforme a temperatura do reator (°C): ");
        double temperatura = sc.nextDouble();

        if (temperatura < 280) {
            System.out.println("Status: Aumentar potência do reator.");
        } 
        else if (temperatura >= 280 && temperatura <= 350) {
            System.out.println("Status: Operação Normal - Cruzeiro.");
        } 
        else {
            System.out.println("Status: EMERGÊNCIA: Acionar sistema de resfriamento e emergência.");
        }

        System.out.println("--------------------------------------");

    }
}

