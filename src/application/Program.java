package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.Departament;
import entites.HourContract;
import entites.Worker;
import entites.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {

        // Formatar a minha data com o padrao que precisp
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque o departamento:");

        // Estanciar um Departamento com a inf digitada
        String dp = sc.next();
        Departament departamentp = new Departament(dp);

        System.out.println("Digite os dados do trabalho");
        System.out.print("Name:");
        String name = sc.next();
        System.out.print("Level:");
        WorkerLevel level = WorkerLevel.valueOf(sc.next());
        System.out.print("Base Salarial:");
        double salary_base = sc.nextDouble();
        Worker worker = new Worker(name , level , salary_base , departamentp);
        System.out.println("Quantos contratos nesse trabalho");
        int contractsQnt = sc.nextInt();
        for (int i = 0; i < contractsQnt ; i++) {
            System.out.println("Contrato #"+i);
            System.out.println("Data(dd/mm/yyyy):");
            Date data;
            try {
                data = sdf.parse(sc.next());
                System.out.println(data);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Valor por hora");


        }
        // Estanciar um Worker
        String dataIncome = sc.next();
        String mes = dataIncome.substring(0,2);
        String ano = dataIncome.substring(3);
        System.out.println(mes);
        System.out.println(ano);
        //


        sc.close();
    }
}