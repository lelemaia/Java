package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class ApiDatas {
    public static void main(String[] args) {

        //mostra data do dia
        LocalDate hoje = LocalDate.now(); 
        System.out.println(hoje);

        //criando data
        LocalDate olimpiadasRio = LocalDate.of(2024, Month.JUNE, 13);

        //calcula a diferença de anos entre essas duas datas
        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);

        //mostra a diferença entre duas datas
        Period periodo = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo);

        //encrementa anos na data atual
        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        //formata a data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);

        //novo formatador q mostra as horas, minutos/segundos (resultado já sai formatado)
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        //representa uma data específica(não importa as horas/minutos)
        YearMonth anoEMes = YearMonth.of(2015, Month.JANUARY);

        //para tabalharmos apenas com tempo, utilizamos o LocalTime.(Representar o horario do intervalo de almoço, por ex)
        LocalTime intervalo = LocalTime.of(12, 30);
        System.out.println(intervalo);
    }
}