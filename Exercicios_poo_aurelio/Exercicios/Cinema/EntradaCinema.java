package Exercicios.Cinema;


import java.util.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;


class EntradaCinema {
    private Data dataFilme;
    private String horario;
    private int sala;
    private double valor;

    public EntradaCinema(Data dataFilme, String horario, int sala, double valor) {
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    public void CalculaDesconto(Data dataNascimento, int carteiraEstudante) {
        int idade = calcularIdade(dataNascimento);

        if (idade < 12) {
            valor *= 0.5; // Desconto de 50% para menores de 12 anos
        } else if (idade >= 12 && idade <= 15) {
            valor *= 0.6; // Desconto de 40% para estudantes de 12 a 15 anos
        } else if (idade >= 16 && idade <= 20) {
            valor *= 0.7; // Desconto de 30% para estudantes de 16 a 20 anos
        } else if (idade > 20) {
            valor *= 0.8; // Desconto de 20% para estudantes com mais de 20 anos
        }
    }

    public void CalculaDescontoHorario() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date horarioFilme = sdf.parse(horario);
            Date horarioLimite = sdf.parse("16:00");

            if (horarioFilme.before(horarioLimite)) {
                valor *= 0.9; // Desconto de 10% para filmes antes das 16 horas
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int calcularIdade(Data dataNascimento) {
        Data dataAtual = new Data(5, 9, 2023); // Data atual (substitua pela data real)
        int idade = dataAtual.getAno() - dataNascimento.getAno();

        if (dataAtual.getMes() < dataNascimento.getMes() || (dataAtual.getMes() == dataNascimento.getMes()
                && dataAtual.getDia() < dataNascimento.getDia())) {
            idade--; // Ainda não fez aniversário este ano
        }

        return idade;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Data do Filme: " + dataFilme.getDia() + "/" + dataFilme.getMes() + "/" + dataFilme.getAno() + "\n" +
                "Horário: " + horario + "\n" +
                "Sala: " + sala + "\n" +
                "Valor: R$" + df.format(valor);
    }
}