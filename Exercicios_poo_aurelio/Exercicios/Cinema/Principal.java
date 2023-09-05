package Exercicios.Cinema;


public class Principal {
    public static void main(String[] args) {
        Data dataFilme = new Data(5, 9, 2023); // Data do filme (substitua pela data real)
        String horario = "14:30"; // Horário do filme (substitua pelo horário real)
        int sala = 1; // Número da sala (substitua pelo número real)
        double valor = 30.00; // Valor normal do ingresso (substitua pelo valor real)

        EntradaCinema ingressoNormal = new EntradaCinema(dataFilme, horario, sala, valor);
        System.out.println("Ingresso Normal:\n" + ingressoNormal);

        Data dataNascimentoMenor12 = new Data(1, 2, 2010); // Exemplo de data de nascimento (menor de 12 anos)
        EntradaCinema ingressoMenor12 = new EntradaCinema(dataFilme, horario, sala, valor);
        ingressoMenor12.CalculaDesconto(dataNascimentoMenor12, 0);
        System.out.println("\nIngresso Menor de 12 anos:\n" + ingressoMenor12);

        Data dataNascimentoEstudante = new Data(10, 5, 2005); // Exemplo de data de nascimento (estudante de 15 anos)
        int carteiraEstudante = 12345; // Número da carteira de estudante (substitua pelo número real)
        EntradaCinema ingressoEstudante = new EntradaCinema(dataFilme, horario, sala, valor);
        ingressoEstudante.CalculaDesconto(dataNascimentoEstudante, carteiraEstudante);
        System.out.println("\nIngresso Estudante:\n" + ingressoEstudante);
    }
}